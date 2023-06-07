package day6.practice;

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
		int num;//1~100 이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올수 없는수
		int random;
		char menu ;
		
		Scanner sc = new Scanner(System.in);
	/*
		int i,j,k;
		for (i=1;i<=max;i++) {
			System.out.println("input positive number : ");
			num = sc.nextInt();
			
			if(num>random) {
				System.out.println("Down");
			}else if (num < random) {
				System.out.println("Up");
			}else if (num == random){
				System.out.println("good!");
				break;
			}
		}
		System.out.println(random);*/
		
		/*
		 * 외부 반복문 : 게임을 더 진행할건지 결정하는 반복문
		 * 반복횟수 : 입력받은 문자가 n이 아닐때까지
		 *규칙성 : up down 게임 한판 진행
		 */
		
		do {
			//랜덤한 수 생성
			random = (int)(Math.random() * (max-min+1)+min);
			
			/*
			 * 내부반복문 : up down 게임 진행하는 반복문
			 * 반복횟수 : 입력받은 숫자가 랜덤한 숫자와 일치하지 않으면 반복
			 * 규칙성 : 입력ㅂㄷ은 숫자가 정답보다 크면 down!, 작으면 up! , 맞으면 Good! 을 축력
			 */
			System.out.println(random);
			do {
				//입력
				System.out.println("input : ");
				num = sc.nextInt();
				
				//판별한 후 결과 출력
				if (num > random) {
					System.out.println("Down");
				}else if (num < random) {
					System.out.println("UP");
				}else {
					System.out.println("Good");
				}
			}while(random != num);
			//menu를 선택( 더한건지 말건지)
			System.out.println("continue?(y/n) :");
			menu = sc.next().charAt(0);
			
		}while (menu != 'n');
		
		sc.close();
	}
}