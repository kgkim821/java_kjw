package day6.practice;

import java.util.Scanner;

public class PrimeNumbersEx {

	public static void main(String[] args) {

		
		int i=5 ,j ,count;

		/*
 * 2부터 100 사이의 소수를 출력하는 코드를 작성하세요
 * 외부 반복문
 * 반복횟수 : i 는 2부터 100 까지 1씩증가
 * 규칙성 : i 가 소수이면 i 를 출력
 * 	
 */
		for(i=2;i<=100; i++) {
		/*
		 * 내부반복분 
		 * 반복횟수 : j 는 1부터 i 까지 1씩 증가
		 * 규칙성 : j 가 i의 약수이면 약수의 개수를 1증가
		 * 반복문 종료후 약수의 개수가 2개이면 i 를 출력
		 */
				
		//i가 소수 이면 i 를 출력하는 코드
		for(j=1, count =0; j<=i ; j++){
		if (i % j ==0) {
			count++;
			}
		}	
		if(count ==2) {
		System.out.println(i);
		
			}
		
		}
	}
}


