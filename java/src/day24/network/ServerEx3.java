package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx3 {

	public static void main(String[] args) {
		int port = 5001;//1. 포트번호 지정
		
		//2. ServerSocket 생성
		try(ServerSocket serverSocekt = new ServerSocket(port);){
			while(true) {
			
				Socket socket = serverSocekt.accept();
				Client client = new Client(socket);
				client.read();
				client.send();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}