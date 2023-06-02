package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		//2의 배수 확인 예제(홀짝 판별)
		
		int num;
		System.out.println("input number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		num = num % 2;
		
		if (num==0) {
			System.out.println("2multiple");
		}else {
			System.out.println("not 2multiple");
		}
	}
}
