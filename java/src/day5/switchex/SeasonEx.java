package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month :");
		month= sc.nextInt();
		
		switch(month){
		case 3: case 4: case 5: 
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summar");
			break;
		case 9: case 10: case 11:
			System.out.println("fall");
			break;
		case 12: case 1: case 2: //12, 1 실행문이 없고 2의 실행문이 실행 case 1, 2, 12 : JDK 7버전 이후로 가능
			System.out.println("winter");
			break;
		default:
			System.out.println("retry");
			break;
		}	
		sc.close();
	}
}

