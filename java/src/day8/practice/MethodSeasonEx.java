package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input month :");
		num = sc.nextInt();
		num = isSeason(num);
		String season = getSeason(num);
		sc.close();
	}

	public static int isSeason(int a) {
	
	if (a>=3 &&a <=5) {//month 가 3 이거나 4이거나 5이면 spring 출력
		System.out.println("spring!");
	}else if(a>=6 && a <=8) {//month가 6이거나 7이거나 8이면 Summer 출력
		System.out.println("summer!");
	}else if (a>=9 &&a <=11) {//month가 9이거나 10이거나 11이면 Summer 출력
		System.out.println("fall!");
	}else if (a==12 || a==1 || a ==2) {//month가 12이거나 1이거나 2이면 Summer 출력
		System.out.println("winter!");
	}else {//아니면 wrong month 출력
		System.out.println("wrong month!");
	}
	return 0;
	}
	
	/**
	 * 월이 주어지면 주어진 월에 맞느 계절을 알려주는 메서드
	 * 매개변수 :월 => int month
	 * 리턴타입 :계절 => String
	 * 메서드명 :getSeason
	 */
	public static String getSeason(int month) {
		if (month>=3 &&month <=5) {//month 가 3 이거나 4이거나 5이면 spring 출력
			return "spring!";
		}else if(month>=6 && month <=8) {//month가 6이거나 7이거나 8이면 Summer 출력
			return "summer!";
		}else if (month>=9 &&month <=11) {//month가 9이거나 10이거나 11이면 Summer 출력
			return "fall!";
		}else if (month==12 || month==1 || month ==2) {//month가 12이거나 1이거나 2이면 Summer 출력
			return "winter!";
		}else {//아니면 wrong month 출력
			return "wrong month!";
		}
	}
	
}

