package day15.practice.controller;

import java.util.Scanner;

public class ShopManger {

	private Scanner sc = new Scanner(System.in);

	public void run() {
		System.out.println("프로그램을 start합니다.");
		
		int menu =-1;
		final int EXIT = 6;
		//System.out.println("프로그램 working");
		
		do {
			//반복 : 선택한 메뉴가 종료가 아닐때	
			
			//메뉴 출력
			printMenu();
			
			menu =sc.nextInt();
			//메뉴 선택
			runMenu(menu);
			
			//선택한 메뉴에 따른 기능을 실행
		
		}while(menu != EXIT);
		System.out.println("프로그램 exit");
	}

	private void printMenu() {
		System.out.println("===============");
		System.out.println("메뉴");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회 판매");
		System.out.println("5. 고객 등록");
		System.out.println("메뉴입니다.");
	}
	
	private void runMenu(int menu) {
		System.out.println("=================");
		
		switch(menu) {
		case 1: System.out.println("제품 판매 기능 구현 예정");
			break;
		case 2:System.out.println("제품 판매 기능 구현 예정");
			break;
		case 3:System.out.println("제품 판매 기능 구현 예정");
			break;
		case 4:System.out.println("제품 판매 기능 구현 예정");
			break;
		case 5:System.out.println("제품 판매 기능 구현 예정");
			break;
		case 6:System.out.println("제품 판매 기능 구현 예정");
			break;
		default:
			
		}
		
	}
}
