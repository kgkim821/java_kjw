package day11.practice;

import java.util.Scanner;

public class ArrayRandomEx {

	public static void main(String[] args) {
		

		
		int min =1 , max =9;
		int random1, random2, random3;
		int [] arr =new int [3];
		/*
		arr[0]= (int)(Math.random() * (max-min+1)+min);
		arr[1]= (int)(Math.random() * (max-min+1)+min);
		arr[2]= (int)(Math.random() * (max-min+1)+min);
			*/					
				
		Scanner sc = new Scanner(System.in);
		System.out.println("input number :");
		
		for (int i=0;i<=3;i++) {
			arr[i]=(int)(Math.random() * (max-min+1)+min);
			System.out.println(arr[i]);
		}
		sc.close();
	}
}