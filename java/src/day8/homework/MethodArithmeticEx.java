package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int num1 , num2, result = 0 ;
		char met;
		//String str ="a";
		
		System.out.println("input 2number and metic :(ex:2 + 3)");
		num1=sc.nextInt();
		met=sc.next().charAt(0);
		num2=sc.nextInt();
		
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
		}
		
	}
	
	public static int sum (int num1 ,int num2) {
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
		
}
