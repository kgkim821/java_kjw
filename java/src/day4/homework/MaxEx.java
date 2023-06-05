package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {

		int num1, num2;
		int max; //두 수 중 큰 수를 저장할 변수
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("input 2 integer number :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		if(num1>=num2) {
			max=num1;
			System.out.println(max);
		}
		else  {
			max=num2;
			System.out.println(num2);
		}
		max = num1 >= num2 ? num1 : num2; //조건연산자 
		
		System.out.println("The greater number of "+num1 + "or "+num2 + "is"+max);
		sc.close();
}
}
