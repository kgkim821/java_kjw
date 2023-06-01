package day3.operator;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		//양수 0보다 크다
		if (num > 0)
		{
			System.out.println("양수입니다.");
		}
		if (num == 0)
		{
			System.out.println("0 입니다.");
		}
		//음수 => 0보다 작다
		if (num < 0)
		{
			System.out.println("음수입니다.");
		}
		sc.close();
	}
}