package day6.practice;

import java.util.Scanner;

public class SumeEx2 {

	public static void main(String[] args) {

		int n, sum=0 ,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		n = sc.nextInt();
		//n을 입력
		
		while (i<=n)
		{
				if (i%2==0) {
					sum +=i;
				}
				i++;
		}
		System.out.println("1~"+n+"even sun : "+sum);
	}

}
