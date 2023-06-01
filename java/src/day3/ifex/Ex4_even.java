package day3.ifex;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
/*
 * 정수 num를 입력받아 num가 홀수 인지 짝수인지 판별하는 코드를 작성하세요
 */
		System.out.println("정수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		//num=num%2;
		if (num%2 == 0)
		{
			System.out.println("odd number");
		}
		if (num%2 != 0)
		{
			System.out.println("even number");
		}	
		
		sc.close();
	}
}
