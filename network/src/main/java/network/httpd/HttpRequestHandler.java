package network.httpd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class HttpRequestHandler extends Thread {
	private static final String DOCUMENT_ROOT ="./webapp";
	
	private Socket socket;

	private String protocol;

	public HttpRequestHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("connected from " + inetSocketAddress.getAddress().getHostAddress() + ":"
					+ inetSocketAddress.getPort());
			
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			String request = null;
			
			while(true) {
				String line = br.readLine();
				
				// 웹브라우저가 연결을 끊으면, 
				if(line == null) {
					consoleLog("closed by client");
					break;
				}
				
				// SimpleHttpServer는 Http Request Header만 처리 한다.
				//	if("".equals(line)) {
				//					break;
				//				}
				
				// Http Request Header의 첫 줄만 읽음
				if(request == null) {
					request = line;
					break;
				}
			}
			
			consoleLog(request);
			
			String[] tokens = request.split(" ");
			if("GET".equals(tokens[0])) {
				this.protocol = tokens[2];
				reponse200(outputStream, tokens[1]);
			} else {
				// method: POST, PUT, DELETE, HEAD, CONNECT
				// SimpleHttpServer에서는 무시(400 Bad Request)
				response400Error(outputStream, protocol);
			}
			
			// outputStream.write("HTTP/1.1 200 OK\n".getBytes("utf-8"));
			// outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("utf-8"));
			// outputStream.write("\n".getBytes("utf-8"));
			// outputStream.write("<h1>이 페이지가 잘 보이면 실습과제 SimpleHttpServer를 시작할 준비가 된 것입니다.</h1>".getBytes("utf-8"));

		} catch (IOException ex) {
			consoleLog("error:" + ex);
		} finally {
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}

			} catch (IOException ex) {
				consoleLog("error:" + ex);
			}
		}
	}

	private void response400Error(OutputStream outputStream, String protocol) throws IOException {
		File errorFile = new File(DOCUMENT_ROOT + "/error/400.html");
		
		byte[] body;
		if (errorFile.exists()) {
			body = Files.readAllBytes(errorFile.toPath());
		} else {
			body = "<html><body><h1>400 Bad Request</h1></body></html>".getBytes("utf-8");
		}
		
		 outputStream.write((protocol + " 400 Bad Request\r\n").getBytes("utf-8"));
		 outputStream.write("Content-Type:text/html; charset=utf-8\r\n".getBytes("utf-8"));
		 outputStream.write("\r\n".getBytes("utf-8"));
		 outputStream.write(body);
	}

	private void reponse200(OutputStream outputStream, String url) throws IOException {
		// default(welcome) file set
		if("/".equals(url)) {
			url = "/index.html";
		}
		
		File file = new File(DOCUMENT_ROOT + url);
		if(!file.exists()) {
			response404Error(outputStream, protocol);
			return;
		}
		
		// nio
		byte[] body = Files.readAllBytes(file.toPath());
		String contentType = Files.probeContentType(file.toPath());
		
		
		outputStream.write("HTTP/1.1 200 OK\n".getBytes("utf-8"));
		outputStream.write(("Content-Type:" + contentType + "; charset=utf-8\n").getBytes("utf-8"));
		outputStream.write("\n".getBytes("utf-8"));
		outputStream.write(body);

	}

	private void response404Error(OutputStream outputStream, String protocol) throws IOException {
		File errorFile = new File(DOCUMENT_ROOT + "/error/404.html");
		
		byte[] body;
		if (errorFile.exists()) {
			body = Files.readAllBytes(errorFile.toPath());
		} else {
			body = "<html><body><h1>404 Not Found</h1><body><html>".getBytes("utf-8");
		} 
		
		outputStream.write((protocol + "404 File NotFound\n").getBytes("utf-8"));
		outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("utf-8"));
		outputStream.write("\n".getBytes("utf-8"));
		outputStream.write(body);
	}

	public void consoleLog(String message) {
		System.out.println("[HttpRequestHandler#" + getId() + "] " + message);
	}
}
