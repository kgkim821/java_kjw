package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		/*
		 * 월을 입력 받아 월에 맞는 영어를 출력하세요.
		 * 단 , 메서드 이용
		 * 
		 * 3 
		 * march
		 * 
		 * 4
		 * april
		 * 
		 * 5
		 * may
		 */
	
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number :");
		num = sc.nextInt();
		
		System.out.println(isMonth(num));
		sc.close();
	}

	public static String isMonth(int num) {
		
		if(num==1) {
			return "January";
		}else if(num==2) {
			return "February";
		}else if(num==3) {
			return "March";
		}else if(num==4) {
			return "April";
		}else if(num==5) {
			return "May";
		}else if(num==6) {
			return "July";
		}
		
		
		return "wrong number!" ;
	}
	
}
