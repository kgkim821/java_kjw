package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {

		/* 두정수를 읿력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요
		 * 
		 * 
		 */
		
		int num1, num2 ,i=1, count = 0, gdc=0 ;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 2number :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		/*for(i=1;i<=num1;i++) {
			
				if (num1 % i == 0 && num2 % i ==0 ) {
					gdc=i;
					}
				if(gdc ==1) {
				System.out.println("ok");
				} else {
					System.out.println("no");
				}
			}*/
		while(i<=num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gdc = i ;
			}
			i++;
		}
		if (gdc==1) {
			System.out.println("ok");
				
		}else {
			System.out.println("no");
		}
		}
}

