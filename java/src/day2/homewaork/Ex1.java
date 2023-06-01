package day2.homewaork;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
			
		
		
		
		int num1, num2;
		char operator;
		Scanner scan;
			
		
		Scanner sc = new Scanner(System.in);
				
			System.out.println("두 정수와 산술연산자를 입력 하세요");

			num1=sc.nextInt();
			operator=sc.next().charAt(0);
			num2=sc.nextInt();
			System.out.println(""+ num1+ " " + operator +" "+ num2);
			
			
			//String str1 = sc.next(); // 스페이스를 포함한 문자열 한줄을 읽어옴(마지막 입력한 엔터 포함)
			//System.out.println(str1);
			
			sc.close();
		
		
	}

}


/*콘솔에서 정수 2개와 문자 (산술연산자)를 입력받아 출력하는 코드를 작성하세요

예시

두 정수와 산술연산자를 입력 하세요 (예 1+2) : 
[입력] 1+2
[출력] 1+2*/