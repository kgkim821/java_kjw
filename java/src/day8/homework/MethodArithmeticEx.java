package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		
		/*
		 * 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 단, 메서드 이용
		 *연산자를 잘못 입력한 경우는 없다고 가정.
		 * 0으로 나누는 일은 없다고 가정.
		 */
		
		
		Scanner sc =new Scanner(System.in);
		int num1 , num2; 
		double res = 0 ;
		char operator;
		//char met;
		//String str ="a";
		
		System.out.println("input (ex:2 + 3) :");
		num1=sc.nextInt();
		//met=sc.next().charAt(0);
		operator = sc.next().charAt(0);
		num2=sc.nextInt();
		
		res=arithmetic(num1, operator, num2);
		
		System.out.println(num1 + " " +operator +" "+ num2 + " = " + res);
		
		res=arithmetic2(num1, operator, num2);
		
		System.out.println(num1 + " " +operator +" "+ num2 + " = " + res);
		
		
		/*
		if(met=='+') {
		System.out.println(sum(num1, num2));
		}else if (met =='-') {
			System.out.println(sub(num1,num2));
		}else if (met =='*') {
			System.out.println(mul(num1,num2));
		}else if (met=='/') {
			System.out.println(div(num1,num2));
		}else {
			System.out.println("error");
		}*/
		sc.close();
	}

	/** 두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 매서드
	 * 매개변수 : 두 정수와 산술 연산자 => int num1 , char operator , int num2
	 * 리턴타입 : 산술 연산 결과 => double
	 * 매서드명 : arithmetic
	 * 
	 * 
	 *  */
	
	
	public static double arithmetic(int num1 , char operator , int num2) {
		double res = 0.0;
		switch(operator) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / (double)num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			//잘못된 연산자인 경우 예외처리를 해야 하는데 아직 안배워서 주석처리
			throw new RuntimeException("Wrong operator!");
		}
		
		return res;
	}
	
	public static double arithmetic2(int num1 , char operator , int num2) {
		switch(operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / (double)num2;
		case '%':
			return num1 % num2;
		default:
			//잘못된 연산자인 경우 예외처리를 해야 하는데 아직 안배워서 주석처리
			//throw new RuntimeException("Wrong operator!");
			return 0.0;
		}
	}
	
	/*public static int sum (int num1 ,int num2) {
		return num1 + num2;
	}
	
	public static int sub (int num1 ,int num2) {
		return num1 - num2;
	}
	public static int mul (int num1 ,int num2) {
		return num1 * num2;
	}
	public static double div (double num1 ,double num2) {
		return num1 / num2;
	}
		*/
}
