package day24.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ChileThread2());
		
		thread.start();
		
		for (int i=0; i< 10 ; i++) {
			System.out.println("+");
		}
		
		
	}

}

class ChileThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10 ; i++) {
			System.out.println("-");
		}
	}
}