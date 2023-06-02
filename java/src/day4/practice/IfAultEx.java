package day4.practice;

import java.util.Scanner;

public class IfAultEx {

	public static void main(String[] args) {

		
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("insert age");
		age = sc.nextInt();
		
		//나이가 20세 이상이면 adult를 출력하고,
		
		//아니면 minor로 출력
		
		if(age >= 20) {
		System.out.println("adult !");
		}else {
		System.out.println("minor !");
		}
		sc.close();
	}

}