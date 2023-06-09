package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input score :");
		num = sc.nextInt();
		
		System.out.println(isscore(num));
		sc.close();
		
	}
	public static char isscore(int num) {
		if ( num>=90 && num<=100  ) {
			num = 'A';
		}else if(num >=80 && num<90) {
			num = 'B';
		}else if(num >=70 && num<80){
			num = 'C';
		}else if(num >=60 && num<70){
			num = 'D';
		}else if(num<60){
			num = 'F';
		}
		return (char) num;	}
	
}
