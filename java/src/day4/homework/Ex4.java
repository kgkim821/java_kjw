package day4.homework;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		
		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		
		int num11, temp , rest ;
		System.out.println("input number :");
		Scanner sc1 = new Scanner(System.in);
		num11 = sc1.nextInt();

		rest=num11 % 2;
		if (rest == 0 ) {
			num11 = num11 /2 ;
			System.out.println(num11);
		}
		
		if (rest ==1) {
			System.out.println(num11+1);
		}
		sc.close();
	}

}
