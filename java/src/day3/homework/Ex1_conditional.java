package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		int gender = sc.nextInt();
		
		char str;
		gender = 'M' ? "false" : "true";
		System.out.println("are you women?" + gender);
		
	}

}
