package network.chat;

import java.io.IOException;  		// 입출력 예외 처리
import java.io.PrintStream; 		// 출력 스트림
import java.io.Writer;				// 문자 출력 스트림 
import java.net.InetSocketAddress;	// IP 주소와 포트
import java.net.ServerSocket;		// 서버에서 클라이언트 연결 기다리는 소켓
import java.net.Socket;				// 클라이언트와 연결되는 통신용 소켓
import java.util.ArrayList;			// 리스트 자료구조
import java.util.List;				// 리스트 인터페이스

public class ChatServer {
	private static final int PORT = 8088;
	
	// 클라이언트들과 연결된 출력 스트림(Writer)을 저장할 리스트
	private static List<Writer> listWriters = new ArrayList<>();

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 소켓(클라이언트 연결을 기다림) 

		try {
			// 콘솔 출력 시 UTF-8로 인코딩해서 한글이 깨지지 않게 함
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
			
			// 서버 소켓 생성
			serverSocket = new ServerSocket();
			
			// 모든 IP 주소에서 들어오는 연결을 허용, 지정한 포트에 바인딩함
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			
			// 서버 콘솔에 연결 대기 중이라고 출력
			consoleLog("연결 기다림: " + PORT);
			
			// 클라이언트 접속을 무한히 기다리는 반복문
			while (true) {
				// 클라이언트가 접속하면 소켓 객체가 생성됨
				Socket socket = serverSocket.accept();
				// 새 클라이언트마다 개별 스레드를 생성해서 연결을 처리함
				// (동시에 여러 명이 접속할 수 있게 됨)
				new ChatServerThread(socket, listWriters).start();
			}

		} catch (IOException ex) {
			
			// 입출력 에러가 발생하면 콘솔에 메시지를 출력
			consoleLog("서버 에러:" + ex);
			ex.printStackTrace(); // 에러 자세히 출력
		} finally {
			
			// 서버를 종료할 때 서버소켓을 닫음 (자원 정리)
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException ex) {
				
				// 서버소켓 닫는 도중 에러가 발생할 경우 출력
				consoleLog("서버 종료 중 에러:" + ex);
				ex.printStackTrace();
			}
		}
	}
	// 콘솔에 메시지를 출력하는 매서드 (앞에 [ChatServer] 라벨 붙이기)
	public static void consoleLog(String message) {
		System.out.println("[ChatServer]" + message);
	}
}
