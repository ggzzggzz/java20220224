package chap18.lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App05Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.75.116", 38080));
		
		boolean run = true;
		while(run) {
			Socket socket = serverSocket.accept();
			Thread thread = new Thread(() -> {
				
				try(
					InputStream is = socket.getInputStream();
					Reader rd = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(rd);
						) {
					System.out.println(socket.getRemoteSocketAddress() + "와 연결 성공");
					
					String data = "";
					while(!(data = br.readLine()).equals("exit")) {
						System.out.println(socket.getRemoteSocketAddress() + "[클라이언트왈]:" + data);
					}
					
					System.out.println(socket.getRemoteSocketAddress() + "[클라이언트채팅 종료]");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			thread.start();
		}
	}
}
