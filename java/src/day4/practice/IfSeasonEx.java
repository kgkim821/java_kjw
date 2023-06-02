package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		

		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
	
		if(month == 3 || month ==4 || month ==5 ) {
			System.out.println("spring!");
		}else if(month == 6 || month ==7 || month ==8 ) {
			System.out.println("summer!");
		}else if(month == 9 || month ==10 || month ==11 ) {
			System.out.println("fall!");
		} else if(month == 12 || month ==1 || month ==2) {
			System.out.println("winter!");
		}else {//아니면 잘못된 월이라고 출력
			System.out.println("wrong month!");
		}
		
		if (month>=3 && month<=5) {
			System.out.println("spring");
		}else if(month>=6 && month <=8) {
			System.out.println("summer");
		}else if(month>=9 && month <=11) {
			System.out.println("fall");
		}else if (month==12 || (month >= 1 && month <= 2 )) {
			System.out.println("winter");
		}else
		{
			System.out.println("wrong month!");
		}
		
		
		
				
		sc.close();
	}

}
