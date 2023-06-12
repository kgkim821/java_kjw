package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
/*
 * 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
 */
		double score = 80;
		System.out.println(getGrad(score));
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input score :");
		num = sc.nextInt();
		
		System.out.println(isscore(num));
		sc.close();
		
	}
	
	/**성적이 주어지면 학점을 알려주는 매서드
	 * 매개변수 : 성적 => 실수 => double
	 * 리턴타입 : 학점 => 문자열 => String
	 * 메서드명 : getGrade
	 * */
	
	public static String getGrad(double score) {
		
		if(score > 100 || score < 0) {
			return "Wrong score!";
		}
		int res = (int)(score/10);
		/*
		 * 100점 => a
		 * 90 점 => a
		 * 80 점 => b
		 * 70 점 => c
		 * 60 점 => d
		 * 그외 f
		 */
		int res (int scor / 10);
		switch(res) {
		case 10 
		case 9 : return "A";
		case 8 : return "B";
		case 7 : return "C";
		case 6 : return "D";
		default : return "F";
		}
		
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
		}else if( num<=0 && num<60){
			num = 'F';
		}
		return (char) num;	}
	
}
