package day7.continueEx;

public class EvenNumberEx {

	public static void main(String[] args) {
		//continue 문을 이용한 10이하 짝수 출력 예제
		int i;
		//홀수 이면 건너뜀
		for (i = 1;i <= 10;i++) {
			//i가 홀수 이면 건너뜀
			
			if(i%2 != 0) {
			continue;
			}
			System.out.println(i);
		}
		
		i = 0;
		while ( ++i <= 10) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			}
		}
}