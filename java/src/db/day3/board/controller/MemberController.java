package db.day3.board.controller;

import java.util.Scanner;

import db.day3.board.service.*;

public class MemberController {

	private MemberService memberService =new MemberServiceimp();

	public void run() {
		int menu;
		final int EXIT =3;
		Scanner sc = new Scanner (System.in);
		
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			
		}while(menu != EXIT);
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			signup();
			break;
		case 2:
			System.out.println("회원탈퇴 예정");
			break;
		case 3:
			System.out.println("[뒤로가기]");
			break;
		default:
			System.out.println("[잘못된 메뉴 입력]");
		}
	}

	private void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디		:");
		String id = sc.next();
		System.out.print("비번 		:");
		String pw = sc.next();
		System.out.print("비번 확인	:");
		String pw2 = sc.next();
			//비번과 비번확인이 일치하지 않으면 확인하는 코드
		if(!pw.equals(pw2)) {
			System.out.println("[비번불일치]");
			return;
		}
		
	}

	private void printMenu() {
		System.out.println("====회원메뉴=======");
		System.out.println("1.회원가입");
		System.out.println("2. 회원탈퇴");
		System.out.println("3. 뒤로가기");
		System.out.println("==============");
		System.out.println("메뉴 선택 :");
	}

	
}
