package day3.operator;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
	System.out.println("input score:");
	Scanner sc=new Scanner(System.in);
	int score = sc.nextInt();
	
	String str;
	str = score >= 60 ? "true" : "false"; 
	System.out.println("Do you pass " + score + " points? " + str);
	
	
	
	sc.close();
	
}

}