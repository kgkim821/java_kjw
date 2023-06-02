package day3.homework;

import java.util.Scanner;

public class EX2_if {

	public static void main(String[] args) {

		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next().charAt(0);
		String result = "";
		//gender 가 M 과 같다
		if(gender == 'M') {
			//System.out.println("Are you a women?"+ "man");
			result = "man";
		}
		//gender 가 W 과 같다
		if(gender == 'W') {
			//System.out.println("Are you a women?" + " women");
			result = "women";
		}
		System.out.println("Are you a women?" + result);		
		sc.close();
		
		/*
		 성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
		System.out.println("input gender : ");
		Scanner sc=new Scanner(System.in);
		
		String str1 = sc.nextLine();
	
		if (str1 == "M")
		{
			str1= "man";
			System.out.println("Are you woman?"+str1 );
		}
		if (str1=="W")
		{
			str1 = "woman";
			System.out.println("Are you woman?"+str1 );
		}
		sc.close();
		*/
	
	}

}
