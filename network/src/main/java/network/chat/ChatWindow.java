package network.chat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;

	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	private String name;

	public ChatWindow(String name) {
		this.name = name;

		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
	}

	public void show() {
		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				pw.println("quit:");
				try {
					if (socket != null && !socket.isClosed()) {
						socket.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});

		frame.setVisible(true);
		frame.pack();

		// 네트워크 연결
		connect();
	}

	private void connect() {
		try {
			socket = new Socket("127.0.0.1", 8088);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 서버에 join 메시지 전송
			pw.println("join:" + name);

			// 메시지 수신 스레드
			Thread receiveThread = new Thread(() -> {
				try {
					while (true) {
						String message = br.readLine();
						if (message == null)
							break;
						updateTextArea(message);
					}
				} catch (IOException e) {
					updateTextArea("서버와의 연결이 종료되었습니다.");
				}
			});
			receiveThread.start();

		} catch (IOException e) {
			updateTextArea("서버 연결 실패: " + e.getMessage());
		}
	}

	private void sendMessage() {
		String message = textField.getText().trim();
		if (message.isEmpty()) {
			return;
			// pw.println("message" + message);
			// textField.requestFocus();
		}
		pw.println("message:" + message);

		textField.setText("");
	}

	private void updateTextArea(String message) {
		textArea.append(message + "\n");
	}
}
