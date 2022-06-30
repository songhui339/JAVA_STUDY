package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
  
   클라이언트 TCP 소켓 프로그래밍 순서 
   
 	1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
	2. 서버와 연결된 입출력 스트림을 생성한다.
	3. 보조 스트림을 통해 스트림의 성능을 개선한다.
	4. 스트림을 통해 데이터를 읽고 쓴다.
	5. 통신을 종료한다.
	
 */
public class Client {
	
	public void start() {
		int port = 30027;
		String serverIP = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;
		String message = null;
		// 127.0.0.1
		
		// 112.186.104.59
//		serverIP = "127.0.0.1";
		
		try {
			// 1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
			// 현재 PC의 IP 주소 가져오기 
			serverIP = InetAddress.getLocalHost().getHostAddress();
			// Socket 객체를 생성하면서 서버와 연결을 시도한다.
			// 서버와의 연결에 성공한다면 서버와 연결된 소켓 객체를 대입한다.
			// 서버와의 연결에 실패하면 null 반환한다.
			socket = new Socket(serverIP, port);
			
			
			if(socket != null) {
				// 2. 서버와 연결된 입출력 스트림을 생성한다.
				// 3. 보조 스트림을 통해 스트림의 성능을 개선한다.
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream(), true);
				
				// 4. 스트림을 통해 데이터를 읽고 쓴다.
				scanner = new Scanner(System.in);
				
				while(true) {
					System.out.print("서버에 보낼 내용 > ");
					message = scanner.nextLine();
					
					pw.println(message);
//					pw.flush(); // autoflush 해놨기 때문에 생략 가능 
					
					if(message == null || message.equals("exit")) {
						System.out.println("접속 종료..");
						
						break;
					}
					
					System.out.println("받은 메세지 : " + br.readLine());
					
					
				}
				
				
			}
		
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				scanner.close();
				br.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	
	
	
	
	
	
	
}
