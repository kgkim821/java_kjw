package day4.ifex;

import java.util.Scanner;

public class NestedIfEx {

	public static void main(String[] args) {
// 2,3,6 배수 판별 예제
		//(day4.practice 패키지에 IfMultipleEx2 문제
		
		int num=6;
		//2의 배수
		if(num %2 ==0) {
			
			//3의 배수 ==> 6의 배수 6,12,18
			if(num %3==0) {
				System.out.println("6 multiple");	
			}
			//아닌 수 ==> 2의 배수 ,2,4,8,10
		else {
			System.out.println("2 multiple");
			}
		}
		else if (num%3==0) {
		System.out.println("3 multiple");
		}
		else {System.out.println("Not multibles of 2,3,6");
			
		}
		
		
		
		
		/*
		//6의 배수가 아닌 2의 배수만 찾기 위해 2의 배수이지만 3의 배수가 아닌 정수를 확인
		if(num %2 ==0 && num%3!=0) {
			System.out.println("2 multiple");
		}else if(num %3 ==0 && num % 2!=0) {
			System.out.println("3 multiple");
		}else if (num %6 ==0 ) {
			System.out.println("6 multiple");
		} else {
			System.out.println("Not multiples of 2,3,6");
		}
		*/
		
		}
}
