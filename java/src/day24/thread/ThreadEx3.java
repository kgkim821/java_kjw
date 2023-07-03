package day24.thread;

public class ThreadEx3 {

	public static void main(String[] args) {

		Thread thread = new Thread(()->{
			for (int i =0; i<10; i++) {
				System.out.println("-");
			}
		});
		//thread.run(); // 멀티쓰레드가 아닌 싱글쓰레드 . main 쓰레드 위에서 run()을 실행
		thread.start(); //
		for (int i=0; i<10 ;i++) {
			System.out.println("+");
		}
		
	}

}
