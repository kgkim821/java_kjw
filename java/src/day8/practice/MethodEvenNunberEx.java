package day8.practice;

import java.util.Scanner;

public class MethodEvenNunberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		System.out.println("input number :");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		if (num1%2==0) {
			System.out.println("EvenNumber");
			
		}else if (num1%2==1) {
			System.out.println("OddNumber.");
		}
		printEvenNumber(num1);

		if (mod(num1,2)==0) {
			if (num1%2==0) {
				System.out.println("EvenNumber");
				
			}else  {
				System.out.println("OddNumber.");
			}	
		}
		
			if (isEvenNumber(num1)) {
				System.out.println("EvenNumber");
				
			}else  {
				System.out.println("OddNumber.");
		
		}
			if (isMultiple(num1,2)) {
				System.out.println("EvenNumber");
				
			}else  {
				System.out.println("OddNumber.");
			}
		sc.close();
		
		}
/**num 가 주어지면 num가 짝수 인지 홀수 인지 출력 하는 메서드
 * @param num : 판별할 정수
 * 리턴타입 :
 * 메서드명 :printEvenNumber
 * @return 없음 => void
 */
	
	public static void printEvenNumber (int num)
		{
			if (num%2==0) {
				System.out.println("EvenNumber");
				
			}else if (num%2==1) {
				System.out.println("OddNumber.");
			}
		}
	
	/**
	 * num1 과 num2 가 주어지면 num1 을 num2 로 나누었을때 나머지를 알려주는 메서드
	 * 매개변수 :두 정수 => int num1, int num2
	 * 리턴타임 :  나누었을 때 나머지 => 정수 => int // 리턴타입이 없을 경우에는 void 로 지정
 	 * 메서드명 : mod
	 *  
	 */
	public static int mod(int num1,int num2) {
	
		return num1%num2;
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 알려주는 메서드
	 * 매개변수 : 판별한 정수 => int num
	 * 리턴타입 : 짝수인지(true) 홀수인지(거짓) => boolean 
	 * 메서드명 :isEvenNumber
	 */
	
	public static boolean isEvenNumber (int num) {
		return num % 2 ==0 ;
	}
	/**
	 * num1 과 num2가 주어지면 num1이 num2의 배수인지 아닌지 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 배수인지(참) 아닌지 (거짓) => boolean
	 * 메서드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0 ;
	}
	
}
	

		
