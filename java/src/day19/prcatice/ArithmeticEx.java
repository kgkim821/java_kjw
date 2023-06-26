package day19.prcatice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input ( ex :1+2) ");
		try {
		int num1 = sc.nextInt();
		char op =sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		sc.close();
		
		switch(op) {
		case '+':
			System.out.println(""+num1 + op + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(""+num1 + op + num2 + "=" + (num1-num2));
			break;
		case '*':
			System.out.println(""+num1 + op + num2 + "=" + (num1*num2));
			break;
		case '/':
			System.out.println(""+num1 + op + num2 + "=" + ((double)num1/num2));
			break;
		case '%':
			System.out.println(""+num1 + op + num2 + "=" + (num1%num2));
			break;
		default :
			System.out.println("not");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("wrong operation!");
			
		}catch(ArithmeticException e) {
			System.out.println("not operation!");
		}
		catch(Exception e) {
		
			System.out.println("exception");
			}
	}
	public static void test1()
	{
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("exception!!");
			return;
		}finally { // 반드시들려서 실행하고 나감 
			System.out.println("method1 exit");
		}
	
	}
	public static void test2()
	{
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("exception!!");
			return;
		}
		System.out.println("method2 exit");
	}
	
}


		
		
