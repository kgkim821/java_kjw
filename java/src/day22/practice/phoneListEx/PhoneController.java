package day22.practice.phoneListEx;

import java.util.Scanner;

public class PhoneController {

	
	private Scanner sc = new Scanner(System.in);
	
	
	public void run () {
		
		int menu =0;
		do {
		
		
		printMenu();
		
		menu = sc.nextInt();
		runMenu(menu);
	
		} while (menu!=4);
	
		sc.close();
	}
	
	private void printMenu() {
		System.out.println("menu");
		System.out.println("1.address input :");
		System.out.println("2.address change");
		System.out.println("3.address search");
		System.out.println("4.exit program");
		System.out.println("intput number");
	}

	private void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			inputAddress();
			break;
		case 2:
			changeAddress();
			break;
		case 3:
			searchAddress();
			break;
		case 4:
			break;
		}
		
		
			
	}

	private void inputAddress() {
		System.out.println("input address :");
		String address = sc.next();
		
		
		
	}
	private void changeAddress() {
		
		
	}
	private void searchAddress() {
		
		
	}

	
}
