package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		String gender = sc.next();
		
		
		String gender1 = "M" != null    ? "false" : "true";
		System.out.println("are you women?" + gender1);
		
		sc.close();
	}

}
