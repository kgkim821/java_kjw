package day4.homework;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int num1, num2, num3;
		System.out.println("input 3 integer num :");
		Scanner sc = new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1<num2+num3) {
			System.out.println("Able to create triangle.");
		}else if(num2<num1+num3) {
			System.out.println("Able to create triangle.");
		}else if(num3<num2+num1) {
			System.out.println("Able to create triangle.");
		}else if(num1>num2+num3) {
			System.out.println("Unable to create triangle.");
		}else if(num2>num1+num3) {
			System.out.println("Unable to create triangle.");
		}else if(num3>num1+num2) {
			System.out.println("Unable to create triangle.");
		}else
		{
			System.out.println("Unable to create triangle.");
		}
		sc.close();
	}

}
