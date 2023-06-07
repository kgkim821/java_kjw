package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
	
		int kor , eng ,math ; 
		double avg;
		char menu = 'y';
		
		Scanner sc = new Scanner(System.in);

		while (menu!='n') {
			System.out.println("input score : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
		
			avg = (kor+ eng+ math)/3.0;
			System.out.println(avg);
			
			System.out.println("continue?(y/n)");
			menu = sc.next().charAt(0) ;
			//break;
			}
		System.out.println("EXIT!");
		sc.close();
	}

}
