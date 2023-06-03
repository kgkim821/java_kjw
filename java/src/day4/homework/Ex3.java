package day4.homework;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int num1, num2, num3 ,temp;
		System.out.println("input 3 integer num :");
		Scanner sc = new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1>num3){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2>num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}	
		
		System.out.println(num1+" / "+num2+" / "+num3);
		
		if(num1+num2>num3) {
			System.out.println("Able to create triangle.");
		}else
		{
			System.out.println("unAble to create triangle.");
				
		}
		sc.close();
	}

}
