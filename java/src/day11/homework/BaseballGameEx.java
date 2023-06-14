package day11.homework;

import java.util.Scanner;

public class BaseballGameEx {

	public static void main(String[] args) {
		
		int input_num1,input_num2,input_num3;
		int st_count=0,ball_count=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 number:");
		
		input_num1 = sc.nextInt();
		input_num2 = sc.nextInt();
		input_num3 = sc.nextInt();
		
		
		
		
		int max =9 , min =1 ;
		int [] arr =new int [3];
		int [] arr2 = new int [3];

						
		boolean checkArr[] = new boolean[10];
		
		for (int i=0;i<3;) {
		int random=(int)(Math.random() * (max-min+1)+min);
		//checkArr 배열에 random 번지에 있는 값이 false 이면
		if(!checkArr[random]) {
			arr[i] = random;
			i++;
			checkArr[random]=true;
			}
			//random을 배열에 저장. i를 증가. checkArr배열에 random 번지에 있는 값을 true로 변경
		}
		
	
		if(input_num1==arr[0]) {
			st_count++;
		}
		if(input_num2==arr[1]) {
			st_count++;
		}
		if(input_num3==arr[2]) {
			st_count++;
		}
		if(input_num1==arr[1]||input_num1==arr[2]) {
			ball_count++;
		}
		if(input_num2==arr[0]||input_num2==arr[2]) {
			ball_count++;
		}
		if(input_num3==arr[0]||input_num3==arr[1]) {
			ball_count++;
		}
		
	
		
		
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
		System.out.println("strike count : "+ st_count + ", ball count"+ball_count);
		sc.close();

		
	}

}
