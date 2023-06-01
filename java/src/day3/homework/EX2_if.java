package day3.homework;

import java.util.Scanner;

public class EX2_if {

	public static void main(String[] args) {

		System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		
		String str1 = sc.nextLine();
	
		if (str1 == "M")
		{
			str1= "man";
			System.out.println("Are you woman?"+str1 );
		}
		
		if (str1=="W")
		{
			str1 = "woman";
			System.out.println("Are you woman?"+str1 );
		}
		
		
		
		sc.close();
	}

}
