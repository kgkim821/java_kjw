package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
/*
 * 정수 num를 입력받아 num의 약수를 구한는 코드를 작성하세요.
 * 12 의 약수 1,2,3,4,6,12
 * 반복횟수 : i는1부터 num까지 1씩증가
 *규칙성 : i가 num의 약수이면 i를 출력
 *       =>num를 i 로 나누었을때 나머지가 0 과 같다면 i 를 출력
 */              
		int num ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input positive number : ");
		num = sc.nextInt();
		
		int i=1;//약수
		while(i <= num) {
			if(num%i==0) {
				System.out.println(i);		
			}
			++i;
		}
	sc.close();
	
	}
	
}