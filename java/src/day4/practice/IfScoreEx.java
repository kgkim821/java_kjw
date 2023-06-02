package day4.practice;

import java.util.Scanner;

public class IfScoreEx {

	public static void main(String[] args) {

		
		int score;
		Scanner sc = new Scanner (System.in);
		System.out.println("input score :");
		score = sc.nextInt();
		
		
		//90이상 ~ 100이하 : A
		//score 가 90 이상이고 score 가 100 보다 작거나 같은면 A라고 출력
		//score 가 90 이상이고 score 가 100 보다 작거나 같은면 A라고 출력
		
		/*
		if(score >=90 && score <=100) {
			System.out.println("A");
		}else if (score >=80 && score <90) {
			System.out.println("B");
		}
		else if (score >=70 && score <80) {
			System.out.println("C");
		}	
		else if (score >=60 && score <70) {
			System.out.println("D");
		}	
		else if (score >=0 && score <60) {
			System.out.println("F");
		}	
		else {
			System.out.println("wrong score");
		}	
		
		 * score가 0미만이거나 100 초과이면 wrong score!
		 * score 90 이상이면 A
		 * score 80 이상이면 A
		 * score 70 이상이면 A
		 * score 60 이상이면 A
		 * 아니면 F 
		 */
		
		if(score <0 || score >100) {
			System.out.println("wrong score!");
		}else if (score >=90) {
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
		}else if (score >=70) {
		 	System.out.println("C");
		}else if (score >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
