package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		
		int num;
		int min =1 , max =100;
		int random = (int)(Math.random() * (max-min+1)+min);
		
		System.out.println("input positive number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while (num != random) {
			
			if(num>random) {
				System.out.println("Down");
			}else if (num < random) {
				System.out.println("Up");
			}
			num = sc.nextInt();
		}
		System.out.println("good!");
		sc.close();
		
	}

}
