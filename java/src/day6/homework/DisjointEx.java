package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {

		/* 두정수를 읿력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요
		 	/*
		 * 반복횠수 : i 는 1부터 num1 까지 1씩 증가
		 * 규칙성 :i 가 num1의 약수이고 i 가 num2 의 약수이면  i 를 gcd에 저장
		 * num1을 i로 나누었을때 나머지가 0과 같고
		 * num2를 i로 나누었을때 나머지가 0과 같다면
		 * i를 gcd에 저장
		 * 반복문 졸료 후 : gcd가 1이면 disjoint를 출력하고,
		 * 아니면 Not disjoint를 출력
		 */
		int num1, num2 ,i=1, count = 0, gcd=0 ;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 2number :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		/*while(i<=num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i ;
			}
			i++;
		}*/
		
		for(;i<=num1;i++){
			if (num1% i ==0 && num2%i==0) {
				gcd = i;
			}
		}
		
		
		if (gcd==1) {
			System.out.println("Disjoint!");
		}else {
			System.out.println("Not disjoint!");
		}
		//gcd가 1이면 Disjoint를 출력하고, 아니면 Not Disjoint를 출력
		sc.close();
		}
}