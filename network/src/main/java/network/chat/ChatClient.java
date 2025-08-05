package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient extends Thread {
	private Socket socket;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;
	private Scanner scanner;

	public ChatClient(String serverIp, int serverPort) throws IOException { 
		socket = new Socket(serverIp, serverPort); // 2. socket 생성과 동시에 서버 연결
		
		// 4. reader/writer 생성
		this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		this.printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

		scanner = new Scanner(System.in); // 1. 키보드 연결
	}

	public void start() {
		try {
			//5. join 프로토콜
			System.out.print("닉네임>> ");
			String nickname = scanner.nextLine();
			printWriter.println("join:" + nickname);
			String response = bufferedReader.readLine();
			
			// 5-1 서버로 부터 "join:ok" 응답을 받아 확인
			if (!"join:ok".equalsIgnoreCase(response)) {
				System.out.println("서버 입장 실패: " + response);
				close();
				return;
			}
			System.out.println("서버 입장 성공!");
			//6. chatClentThread(서버로부터 메시지를 받는 스레드 시작)
			Thread receiveThread = new Thread() {
				@Override
				public void run() {
					try {
						while (true) {
							String message = bufferedReader.readLine();
							if (message == null) {
								System.out.println("서버와 연결이 끊겼습니다.");
								break;
							}
							System.out.println(message);
						}
					} catch (IOException e) {
						System.out.println("서버로부터 데이터를 읽는 중 오류: " + e.getMessage());
					}
				}
			};
			receiveThread.start();
			// 7. 키보드 입력 처리
			while (true) {
				System.out.print(">> ");
				String input = scanner.nextLine();

				if ("quit".equalsIgnoreCase(input)) {
					printWriter.println("quit:"); // 8. quit 프로토콜 처리
					break;
				} else {
					printWriter.println("message:" + input); // 9. 메시지 처리
				}
			}
			close();

		} catch (IOException e) {
			System.out.println("에러 발생: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (printWriter != null)
				printWriter.close();
			if (bufferedReader != null)
				bufferedReader.close();
			if (socket != null && !socket.isClosed())
				socket.close();
			if (scanner != null)
				scanner.close();
		} catch (IOException e) {
			System.out.println("자원 정리 중 오류: " + e.getMessage()); // 10. 자원정리
		}
	}

	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream(System.out, true, "UTF-8")); // 콘솔에 한글 출력 깨지는거 방지
			ChatClient client = new ChatClient("localhost", 8088);	   // 서버 연결 시작
			client.start();											   // 실행 시작
		} catch (IOException e) {
			System.out.println("서버 연결 실패: " + e.getMessage());
		}

	}
}
