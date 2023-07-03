package day24.thread;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpEX {

	public static void main(String[] args) {

		InetAddress inetAdress = null;
		
		//이름이 localhost 인 곳의 IP 주소 정보를 가져옴 모든 pc 가 같음
		try {
			inetAdress = InetAddress.getByName("localhost");
			System.out.println(inetAdress);
			//네이버 사이트의 아이피 주소 조회

			inetAdress = InetAddress.getByName("www.naver.com");
			System.out.println(inetAdress);
			//내pc의 아이피 조회
			inetAdress = InetAddress.getLocalHost();
			System.out.println(inetAdress);
			InetAddress [] address = InetAddress.getAllByName("www.naver.com");
			for(InetAddress tmp : address) {
				System.out.println(tmp);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
