package day11.array;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {

		//  12 : 1 2 3 4 6 12
		/*
		 * 0번지 1
		 * 1번지 2
		 * 2번지 3 
		 * 3번지 4
		 * 4번지 6
		 * 5번지 12
		 */
		
		int num = 0; 
		int count =0;
		int divisor[] = new int [10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number :");
		num=sc.nextInt();
		
		for(int i =1;i <= num ;i ++) {
			if(num % i ==0) {
				divisor[count]  = i ;
				count++;
			}
			if (count==divisor.length) {
				break;
		}
	}
		for (int i =0;i<count;i++) {
			System.out.println(divisor[i]);
		}
		
		sc.close();
	}
}