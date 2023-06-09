package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		if(isMultiple(num, 6)) {
			System.out.println(num + "is a multiple of 6. ");
		}else if (isMultiple(num, 2)) {
			System.out.println(num + "is a multiple of 2. ");
		}else if (isMultiple(num, 3)) {
			System.out.println(num + "is a multiple of 3. ");
		}else {
			System.out.println(num + "is not a multiple of 2,3,6");
		}
		
		isMulti(num);
		
		sc.close();
	}
	
	public static void isMulti(int a) {
		if (a%6==0)
		{
			System.out.println("6 multi");
		}else if (a%3==0) {
			System.out.println("3 multi");
		}else if (a%2==0) {
			System.out.println("2 multi");
		}
	}

	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0 ;
	}
}
