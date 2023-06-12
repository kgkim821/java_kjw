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
	
	//	int num ;
//		Scanner sc = new Scanner(System.in);
	//	System.out.println("input number :");
	//	num = sc.nextInt();
		
	//	System.out.println(isMonth(num));
	//	sc.close();
		printMonth(1);
		System.out.println(getMonth(2));
	}

	/**월이 주어지면 주어진 월의 영문을 출력하는 매서드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printMonth
	 * */

	public static void printMonth (int month) {
		switch (month) {
		case 1: System.out.println("January");   	break;
		case 2: System.out.println("Feburary");   	break;
		case 3: System.out.println("March");   		break;
		case 4: System.out.println("April");   		break;
		case 5: System.out.println("May");   		break;
		case 6: System.out.println("June");   		break;
		case 7: System.out.println("July");   		break;
		case 8: System.out.println("August");   	break;
		case 9: System.out.println("September");   	break;
		case 10: System.out.println("October");   	break;
		case 11: System.out.println("November");   	break;
		case 12: System.out.println("December");   	break;
		default:System.out.println("Wrong month!");
		}
	}
	
	/**월이 주어지면 주어진 월의 영문을 알려주는 메서느
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 월의 영문 => String
	 * 매서드명 : getMonth
	 * 
	 * */
	public static String getMonth(int month) {
		switch (month) {
		case 1: return "January";
		case 2: return  "Feburary";   	
		case 3: return "March";   		
		case 4: return "April";   		
		case 5: return "May";   		
		case 6: return "June";   		
		case 7: return "July";   		
		case 8: return "August";   	
		case 9: return"September";   	
		case 10: return "October";  
		case 11: return "November"; 
		case 12: return "December"; 
		default:System.out.println("Wrong month!");
		}
		return null;
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
