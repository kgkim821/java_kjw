package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		
		char gender ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		boolean result = gender == 'W' ? true : false ;
		
		System.out.println("Are you a women?"+result );		
		sc.close();
		
		/*
		 * 성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
		 * 
		 * System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		String gender = sc.next();
		
		
		String gender1 = "M" != null    ? "false" : "true";
		System.out.println("are you women?" + gender1);
		
		sc.close();*/
	}

}
