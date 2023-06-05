package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {

		int kor;
		int math;
		int eng;
		double agv;
	
		//국어 , 영어 , 수학순으로 성적을 입력
		System.out.println("input score (kor,eng,math) ex: 100 90 80 :");
		Scanner sc = new Scanner(System.in);
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
		agv =( kor + math + eng ) /(double)3.0; // double 형 변환 
		//평균을 계산
		System.out.println("agv : " + agv);
		//평균을 출력
		sc.close();
	}
}