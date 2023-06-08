package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {

		/*
		 * 반복횠수 : i 는 1부터 num1 까지 1씩 증가
		 * 규칙성 :i 가 num1의 약수이고 i 가 num2 의 약수이면  i 를 gcd에 저장
		 * num1을 i로 나누었을때 나머지가 0과 같고
		 * num2를 i로 나누었을때 나머지가 0과 같다면
		 * i를 gcd에 저장
		 * 반복문 졸료 후 : gcd 출력
		 */
		

		int num1, num2, i=1, gcd =1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("input number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();//두정수를 입력
	
		
		while (i <= num1) {//반 복분(최대공약수를 구하기 위한) : i 가 num1 까지
			
			if(num1 % i == 0 && num2 % i==0) {
				gcd = i;	
			}
			++i;
		}
		//gcd 출력
		System.out.println(num1 + "and" + num2 + "gcd : " + gcd);
	}

}
