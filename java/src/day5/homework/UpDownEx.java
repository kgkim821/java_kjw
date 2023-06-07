package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/*
		 * 1~100 사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요
		 * 
		 * 랜덤한 수를 생성 ( 및 출력)
		 * 
		 * 반복문 : 맞출때까지 => 입력한 정수가 정담이 아니면 반복
		 * 정수와 정답을 비교하여 판별
		 */
		
		
		int min =1 , max =100;
		int num=min -1;//1~100 이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올수 없는수
		int random = (int)(Math.random() * (max-min+1)+min);
		
		Scanner sc = new Scanner(System.in);
		
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
		}
		
		System.out.println(random);
		sc.close();
	}
}
