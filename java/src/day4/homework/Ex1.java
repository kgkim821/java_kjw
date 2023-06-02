package day4.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		double kor;
		double math;
		double eng;
		double agv;
		
		System.out.println("insert score :");
		Scanner sc = new Scanner(System.in);
		kor = sc.nextDouble();
		math = sc.nextDouble();
		eng = sc.nextDouble();
		agv =( kor + math + eng ) /3;
		
		System.out.println(agv);
		
		sc.close();
		}

}
