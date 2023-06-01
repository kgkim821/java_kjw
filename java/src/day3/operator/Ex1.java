package day3.operator;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		
		System.out.println("input score:");
		Scanner sc=new Scanner(System.in);
		int score = sc.nextInt();
		boolean result = score >= 60; 
		System.out.println("Do you pass" + score + "points? " + result);
		
		
		/*int num11 = score ;
		String str;
		
		str = num11 >= 60 ? "true" : "false";
		System.out.println(""+" Do you pass " + num11 + "point?" +str);
		*/
		sc.close();
	}

}
