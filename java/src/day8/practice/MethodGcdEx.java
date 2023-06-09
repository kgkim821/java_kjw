package day8.practice;

import java.util.Scanner;

public class MethodGcdEx {

	public static void main(String[] args) {

		int num1, num2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number :");
		num1 =sc.nextInt();
		num2 = sc.nextInt();
		
		isGcd(num1, num2);

		int gcd= gcd(num1,num2);
		
		int max=max(num1,num2);
		System.out.println(num1 + "and" + num2 + "gcd :" + gcd + " " + max);
		
		sc.close();
	}
	
	public static void isGcd(int a , int b)
	{
		int gcd = 0;
		
		for(int i=1;i<=a;i++) {
			if (a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);	
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0 ;
	}
	
	/**
	 * 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메서드
	 * 메개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최대 공약수 => 정수 => int
	 * 매서드명 : gcd
	 */
	
	public static int gcd(int num1, int num2 ) {
		for ( int i =num1; i >=i; i--) {
			if (isMultiple(num1, i)&&isMultiple(num2, i)) {
				return i;
			}
		
		}
		return 1;
	}
	
	public static int max(int num1, int num2 ) {
		for ( int i =num1; i >=i; i--) {
			if (isMultiple(num1, i)&&isMultiple(num2, i)) {
				return (num1 * num2 ) /i;
			}
		}
		return 1;
	}
}