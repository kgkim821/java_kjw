package day2.homewaork;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요.
	단 2번째 숫자는 0 이 아님.

	예:
	두 정수를 입력하세요.
	12 [엔터]
	1+2 = 3
	1-2 = -1
	1*2 = 2
	1/2 =0.5
	1%2=1
			
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("1정수를 입력해주세요");
		int num1 = sc.nextInt(); // 정수를 입력 받음
		System.out.println(num1);
		
		
		System.out.println("2정수를 입력해주세요");
		int num2 = sc.nextInt(); // 정수를 입력 받음
		System.out.println(num2);
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div =(double) num1 / num2; // 1/2의 결과가 0 이여서, 1.0/2로 바꾸어 0.5가 나오게함
		int mod = num1 % num2;
		
		System.out.println(""+num1+'+'+ num2+ "="+sum);
		System.out.println(""+num1+'-'+ num2+ "="+sub);
		System.out.println(""+num1+'*'+ num2+ "="+mul);
		System.out.println(""+num1+'/'+ num2+ "="+div);
		System.out.println(""+num1+'%'+ num2+ "="+mod);
	*/
	
		System.out.println("두정수를 입력하세요.");
		//안내분구 입력
		Scanner sc=new Scanner(System.in);
		//두 정수를 입력 받음
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//두 정수의 산술 연산을 계산
		
		//int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div =(double) num1 / num2;
		int mod = num1 % num2;
		
		//System.out.println(""+num1+'-'+ num2 + "="+sum);
		System.out.println(""+num1+'+'+ num2 + "="+(num1 + num2)); // + 연산자가 먼저 수행되기 때문에 + , - 가있을경우 괄호 표시 필요
		System.out.println(""+num1+'-'+ num2 + "="+sub);
		System.out.println(""+num1+'*'+ num2 + "="+mul);
		System.out.println(""+num1+'/'+ num2 + "="+div);
		//System.out.println(""+num1+'%'+ num2 + "="+mod);
		
		System.out.println(""+num1+'%'+ num2 + "="+(num1 % num2));
		
		sc.close();
		
		
	}

}
