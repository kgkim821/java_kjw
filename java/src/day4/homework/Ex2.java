package day4.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		if(num1>num2) {
			System.out.println(num1);
		}
		else if(num1<num2) {
			System.out.println(num2);
		}else {
			System.out.println("retry");
		}
		
		sc.close();
	}

}
