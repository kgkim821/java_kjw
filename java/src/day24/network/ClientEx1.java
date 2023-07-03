package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		int port = 5001;
		Scanner sc = new Scanner(System.in);
		
		// 1. 소캣 생성
		try(Socket socket = new Socket();){
		//2. 연결요청
		
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[Connect]");
		//3. 작업
			//서버에 데이터 전송을 위해 OutputStream 생성
			OutputStream os = socket.getOutputStream();
			String str = sc.nextLine(); // 보내려는 데이터
			byte [] bytes= str.getBytes();//Hi를 바이트로 변환
			os.write(bytes);
			os.flush();
			InputStream is = socket.getInputStream();
			int readCount = is.read(bytes);
			bytes = new byte[1024];
			
			str = new String(bytes);
			System.out.println("server : " +str);
			
			is.close();
			os.close();

		} catch (IOException e) {
			System.out.println("Connection refused!");
			
		}
	}
}

/* 
 작업 종료방법
 * 1.이미 port를 사용중이어서 실행이 안되는 경우
2.명령어 입력
netstat -ano
를 통해서 pid 찾음

3. 사용중인 포트번호를 확인 
-로컬주소부분에 xxx.xxx.xxx.xxx : 포트번호
4.포트번호에 맞느 pid 확인
5.작업관리자 실행
- 작업 표시줄 우클릭 > 작업관리자 선택
6.세부정보 택 클릭후 확인한 pid 에맞는 프로그램을 작업끝내기

*/