package day4.homework;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int num1, temp , rest ;
		System.out.println("input number :");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();

		rest=num1 % 2;
		if (rest == 0 ) {
			num1 = num1 /2 ;
			System.out.println(num1);
		}
		
		if (rest ==1) {
			System.out.println(num1+1);
		}
	}

}
