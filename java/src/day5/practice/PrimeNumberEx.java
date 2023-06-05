package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
/*
 * 소수 : 약수 가 2개인 수 , 1을 제외하고 
 * 11 2,3,4,5, 11
 * 4 : 2,3,4
 * 
 * 반복문 종료 후 : count 가 2이면 소수라고 출력, 아니면 소수가 아님이라고 출력
 * 
 * count 가 2이면 소수라고 출력, 아니면 소수가 아님이라고 출력
 
 */
		int num,i,count;
		
		count=0;
		
		System.out.println("input positive number :");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();//정수 입력

		i=1;
		
		while(i <= num) {
			if(num%i==0) {
				count++;		
			}i++;
		}
		if (count ==2) {
			System.out.println(num + " is primenum number.");
		}else {
			System.out.println(num + " is not primenum number.");
		}
		sc.close();
	}
}