package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	private List<Writer> listWriters;
	private PrintWriter printWriter;

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		try {
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("connected from " + inetSocketAddress.getAddress().getHostAddress() + ":"
					+ inetSocketAddress.getPort());

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			this.printWriter = pw;

			while (true) {
				String request = br.readLine();

				if (request == null) {
					consoleLog("클라이언트로 부터 연결 끊김");
					doQuit(printWriter);
					break;
				}

				String[] tokens = request.split(":", 2);
				if (tokens.length < 2) {
					consoleLog("잘못된 요청: " + request);
					continue;
				}

				String command = tokens[0];
				String data = tokens[1];

				if ("join".equals(command)) {
					doJoin(data, printWriter);
				} else if ("message".equals(command)) {
					doMessage(data);
				} else if ("quit".equals(command)) {
					doQuit(printWriter);
					break;
				} else {
					consoleLog("알수없는 요청:" + request);
				}
			}

		} catch (IOException ex) {
			consoleLog("에러: " + ex);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException ex) {
				consoleLog("에러:" + ex);
			}
		}
	}

	private void doJoin(String nickName, Writer writer) {
		this.nickname = nickName;
		addWriter(writer);

		printWriter.println("join:ok");

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

	}

	private void doMessage(String message) {
		String data = nickname + ": " + message;
		broadcast(data);
	}

	private void doQuit(Writer writer) {
		removeWriter(writer);
		String data = nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
	}

	private void addWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}

	private void removeWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.remove(writer);
		}
	}

	private void broadcast(String data) {
		synchronized (listWriters) {
			for (Writer writer : listWriters) {
				try {
					PrintWriter pw = (PrintWriter) writer;
					pw.println(data);
				} catch (Exception e) {
					consoleLog("메세지 전송 실패: " + e.getMessage());
				}

			}
		}
	}

	public void consoleLog(String message) {
		System.out.println("[ChatServerThread#" + getId() + "] " + message);
	}
}