package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
//10 이하의 짝수를 출력하는 예제
		
		int i;
		/*
		 * 방법1. 
		 * 반복횟수 i는 1부터 5까지 1씩 증가
		 * 규칙성 2*i를 출력
		 */
		 i =1 ;
		while (i<= 5) {
			System.out.println(2*i);
			++i;
		}
		System.out.println("===================");
		
		 /* 방법2.
		 * 반복횟수 : i 는 2부터 10까지 2씩 증가
		 * 규칙성 : i를 출력
		 */
		
		i=2;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		System.out.println("================");
		 /* 방법3. 
		 * 반복횟수 : i는 1부터 10 까지 1씩 증가
		 * 규칙성 : i가 짝수 이면 i 를 출력
		 */
		i=1;
		while(i<= 10) {
		if(i%2==0) {
			System.out.println(i);
		}
		++i;
		}
		
		
		
	}
}