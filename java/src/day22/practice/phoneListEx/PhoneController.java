package day22.practice.phoneListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneController {

	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Integer> addressList = new ArrayList<>();

	
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
		System.out.println("Menu");
		System.out.println("1.Address input :");
		System.out.println("2.Address change");
		System.out.println("3.Address search");
		System.out.println("4.Exit program");
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
	    System.out.print("Enter address: ");
	    int address = sc.nextInt();

	    addressList.add(address);
	    System.out.println("Address added: " + address);
	}

	private void changeAddress() {
	    System.out.print("Enter the index of the address to change: ");
	    int index = sc.nextInt();

	    if (index >= 0 && index < addressList.size()) {
	        System.out.print("Enter the new address: ");
	        int newAddress = sc.nextInt();

	        addressList.set(index, newAddress);
	        System.out.println("Address at index " + index + " changed to " + newAddress);
	    } else {
	        System.out.println("Invalid index. No address found.");
	    }
	}

	private void searchAddress() {
	    System.out.print("Enter the address to search for: ");
	    int searchAddress = sc.nextInt();

	    int index = addressList.indexOf(searchAddress);

	    if (index != -1) {
	        System.out.println("Address found at index " + index);
	    } else {
	        System.out.println("Address not found.");
	    }
	}

	
}
