package day15.practice.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Customer;
import day15.practice.shop.vo.Sales;
import day15.practice.shop.vo.product;
import lombok.Data;

@Data
public class ShopManger {

	private Scanner sc = new Scanner(System.in);//명시적 초기화
	private product list [] = new product[10];//제품 리스트
	private int count =0;
	private Customer customerList[] = new Customer[10]; //최대 10명의 고객 관리
	private int customerCount =0; // 저장된 고객수
	private Sales salesHistory [] = new Sales[100];// 판매 기록
	private int salesCount;
	private int totalPrice;
	
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
		/*
		Customer customer = new Customer("홍길동", " 010-1234-5678");
		customer.print();
		customer = new Customer("임꺽정", "010-1211-5555");
		customer.print();
		*/
		//고객 정보(이름 , 전화번호) 를 입력
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("번호 :");
		String phoneNumber = sc.next();
		
		//고객을 등록(고객 리스트에)
		//이미 등록된 전화번호이면 등록 x
		for(int i=0;   i<customerCount; i++) {
			//
			//
			//
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println("등록된 번호! 고객등록 실패");
				return;
			}
		}
		//새 전화번호이면 등록
		//입력받은 고객 정보를 이요하여 고객 객체를 생성한후, 마지막 고객 다음에 새 고객을 추가
		//등록된 고객의 수를 증가
		customerList[customerCount++] = new Customer(name,phoneNumber);
		
		
	}

	private void printSales() {
		//매출 내역 출력
		
		for(int i=0; i< salesCount; i++) {
			salesHistory[i].print();
		}
		//누적 매출내역 출력
		
	}

	//제품을 검색해서 조회하는 매서드
	private void printProduct() {
		//검색할 제품을 입력
		System.out.println("제품명 :");
		sc.nextLine();
		String name = sc.nextLine();
		
		//입력한 검색어에 맞는 제품을 출력
		
		//등록된 제품들 중에 검색어와 일치하는 제품이 어디있는지 확인
		int index = indexOf(name);
		
		//제품이 있으면 제품 정보를 출력
		if(index >=0) {
			list[index].print();
			return;
		}
		
		//없으면 없는 제품이라고 출력
		System.out.println("");
	}

	private void store() {
		
		System.out.print("제품명 :");
		String name =sc.nextLine();
		
		
		int amount = sc.nextInt();
		
		//입고할 제품명 입력
		if(amount < 0 ) {
			System.out.println("입고 수량 오류!");
			return;
		}
		
		int index = indexOf(name);
		
		
		//입고할 제품 수량
		
		
		if(index != -1) {
			return;
		}
		
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
		//제품명 입력
		System.out.println("제품명 :");
		sc.nextLine();
		String name = sc.nextLine();
		//제품 개수 입력
		System.out.println("개수 :");
		int amount = sc.nextInt();
		
		//고객 정보 입력
		System.out.println("번호 :");
		String phoneNumber = sc.next();
		
		//있는 제품인지 확인
		int index = indexOf(name);
		if(index <0) {
			System.out.println("제품명 오류!");
			return;
		}
		if(amount <= 0) {
			System.out.println("제품 수량 오류!");
			return;
		}
		
		//있는 고객인지 확인
		int customerindex = indexOfCustomer(phoneNumber);
		if(customerindex <0) {
			System.out.println("전화번호 오류!");
			return;
		}
		//판매 내역에 추가
		//제품 정보
		//복사 생성자를 이용해서 제품 정보를 복사(깊은복사)
		product product = new product(list[index]);
		product.setAmount(amount);
		
		//고객 정보
		//
		Customer customer = customerList[customerindex];
		
		Sales sales = new Sales(customer, product );
		salesHistory[salesCount++] = sales;
		
		//판매된 개수만큼 제고량에서 빼줘야함
		list[index].release(amount);
		
		//매출금액을 추가
		totalPrice += sales.getTotalPrice();

		
	}

	private int indexOfCustomer(String phoneNumber) {

		for(int i =0; i<customerCount; i++) {
			//고객의 번호가 같은면
			
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return 0;
	}
}
