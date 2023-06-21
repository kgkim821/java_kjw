package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.shop.vo.product;

public class ShopManger {

	private Scanner sc = new Scanner(System.in);
	private product list [] = new product[10];
	private int count =0;
	
	
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
		case 1:
			sell();
			break;
		case 2:
			store();
			break;
		case 3:
			printProduct();
			break;
		case 4:
			printSales();
			break;
		case 5:
			registeCustomer();
			break;
		case 6:

			break;
		default:
			System.out.println("잘못된 메뉴");
		}
		
	}

	private void registeCustomer() {
		// TODO Auto-generated method stub
		
	}

	private void printSales() {
		// TODO Auto-generated method stub
		
	}

	private void printProduct() {
		// TODO Auto-generated method stub
		
	}

	private void store() {
		
		System.out.print("제품명 :");
		sc.nextLine();
		String name =sc.nextLine();
		
		System.out.println("수량 :");
		int amount = sc.nextInt();
		
		//입고할 제품명 입력
		if(amount < 0 ) {
			System.out.println("입고 수량 오류!");
			return;
		}
		
		int index = indexOf(name);
		
		
		//입고할 제품 수량
		
		
		if(index != -1) {
			list[index].store(amount);
			System.out.println("입고 완료!");
			return;
		}
		if(count == list.length) {
			System.out.println("제품리스트 다참");
			return;
		}
		
		System.out.println("새 제품 등록");
		System.out.print("모델명 :");
		sc.nextLine();
		String modelName = sc.nextLine();
		//가격을 입력
		System.out.println("가격 :");
		int price = sc.nextInt();
		
		//분류 입력
		System.out.println("분류  :");
		String category = sc.next();
		
		list[count++] = new product(name, modelName, price, amount , category);
		
		System.out.println("제품 추가 후 입고 완료!");
	}

	/**제품리스틍 제품명과 일치하는 제품이 있으면 번지를 , 없으면
	 * -1을 알려주는 메서드
	 * 매개변수 : 제품명 => String name
	 * 리턴타입 : 제품이 있는 번지나 -1 => 정수 => int
	 * 메서드명 : indexOf
	 */
	
	public int indexOf(String name) {
		for (int i=0; i< count;i++) {
			if(list[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	private void sell() {

		
	}
}
