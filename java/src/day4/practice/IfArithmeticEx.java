package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
//산술연산자와 두 정수를 입력받아 산술 연산자에 맞는 연산 결과를 출력하는 코드르 작서하세요
		/*op num1  num2
		 * op가 +이면 num1 + num2를 출력하고
		 * op가 -이면 num1 - num2를 출력하고
		 * op가 -이면 num1 - num2를 출력하고
		 * op가 /이면 num1 / num2를 출력하고
		 * op가 +이면 num1 % num2를 출력하고
		 * op가 산술연산자가 아니면 op is net arithmetic operator! 를 출력
		 */
		
		/*
		Scanner sc =new Scanner(System.in);
		System.out.println("input 2 nums and arithmetic operator :");
		char op = sc.next().charAt(0);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div =(double) num1 / num2; 
		int mod = num1 % num2;
		
		if(op=='+') {
			System.out.println(sum);
		}else if(op=='-') {
			System.out.println(sub);
		}else if(op=='*') {
			System.out.println(mul);
		}else if(op=='/') {
			System.out.println(div);
		}else if(op=='%') {
			System.out.println(mod);
		}else {
			System.out.println("op is net arithmetic operator!");
		}
		
		*/
		
		
		int num1, num2 ;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and arithmemtic operator");
		num1 =sc.nextInt(); 
		op =sc.next().charAt(0);
		num2 = sc.nextInt();
		
		
		
		if(op == '+'){
			System.out.println(num1 + " " + op + " "+ num2 + "=" +(num1 + num2));
		}else if(op == '-')	{
			System.out.println(num1 + " " + op + " "+ num2 + "=" +(num1 + num2));
		}else if(op == '*')	{
			System.out.println(num1 + " " + op + " "+ num2 + "=" +(num1 + num2));
		}else if(op == '/')	{
			System.out.println(num1 + " " + op + " "+ num2 + "=" +((double)(num1 + num2)));
		}else if(op == '%')	{
			System.out.println(num1 + " " + op + " "+ num2 + "=" +(num1 + num2));
		}else {
			System.out.println(op+"is net arithmetic operator!");
		}
				
		sc.close();
	}

}
