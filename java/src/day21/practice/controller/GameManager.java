package day21.practice.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day21.practice.updown.vo.RecordGame;

public class GameManager implements Program {

	//리터럴 3에 이름을 붙여서 명확하게 전달하기 위해.
	private static final int Exit =3;
	
	//다른 매서드엥서 매번 객체를 생성하는게 번거로워서
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList<RecordGame> list = new ArrayList<>();
	
	@Override
	public void printMenu() {

		System.out.println("1.play");
		System.out.println("2.record");
		System.out.println("3.exit");
		System.out.println("select menu :");
	}

	@Override
	public void run() {
	System.out.println("Program Start!");
	
	int menu;
	do {
		printMenu();
		menu = sc.nextInt();
			
		runMenu(menu);
		
		
	}while(menu != Exit);
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			playGame();
			break;
		case 2:
			recordGame();
			break;
		case 3:
			
			break;
			
		default : 
				System.out.println("wrong menu!");
			
		}
		
	}

	private void recordGame() {
		for(RecordGame tmp : list) {
			System.out.println(tmp);
		}
		
	}

	private void playGame() {
		int min =1 , max =100;
		int num=min -1;//1~100 이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올수 없는수
		int random = (int)(Math.random() * (max-min+1)+min);
		System.out.println(random);
		int count =0 ;
		
		while (random != num) {
			System.out.println("input positive number : ");
			num = sc.nextInt();
					
			if(num>random) {
				System.out.println("Down");
			}else if (num < random) {
				System.out.println("Up");
			}else {
				System.out.println("good!");
			}
			count ++;
		}
		//기록 : 아이디(입력) , 플레이 회수
		//아이디 입력
		System.out.println("record id :");
		String id = sc .next();
		//어떻게 저장해서 관리?
		RecordGame rec = new RecordGame(id, count);
		list.add(rec);
		list.sort(null);
		sort();
	}
	
	private void sort()
	{
		for(int i = 0 ; i<list.size()-1; i++) {
			for( int j = 0; j <list.size()-1; j++) {
				
				if(list.get(j).getCount()> list.get(j+1).getCount()) {
					RecordGame tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
					
				}
			}
		}
	}
}
