package day6.dowhileEx;

public class HellowWordEx {

	public static void main(String[] args) {
/*
 * for 문을 이용하여 Hello world를 5번 출력하는 예제
 * 반복횟수 : i 는 1부터 5까지 1씩 증가 
 * 규칙성 : Hello world 를 출력
 */

		int i ;
		for(i = 1 ; i <= 5 ; i++) {
			System.out.println("Hello world");
		}
		System.out.println("=============");
		i=1;
		while (i<=5) {
			System.out.println("Hello world");
			i++;
		}
		
	}

}
