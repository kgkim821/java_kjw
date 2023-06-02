package day3.homework;

import java.util.Scanner;

public class Ex1_conditional2 {

	public static void main(String[] args) {
		String gender; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false ;
		
		System.out.println("Are you a women?"+result );		
		sc.close();
		
		/*System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		String gender = sc.next();
		
		
		String gender1 = "M" != null    ? "false" : "true";
		System.out.println("are you women?" + gender1);
		
		sc.close();*/
		
	}

}
