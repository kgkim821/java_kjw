package day7.breakEx;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {

		/*두정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		 *
		 * 두 정수 입력 
		 * 반복횟수 : i 는 1부터 (num1 * num2) 까지 1씩 증가
		 * 규칙성 : i 가 num1의 배수이고 i 가 num2의 배수 이면
		 * 		i를 출력 후 반복문을 종료
		 * 		=>i를 num1로 나누었을때 나머지가 0 과 같고
		 * 		=>i를 num2로 나누었을때 나머지가 0 과 같다면
		 * 		  i를 출력 후 반복문을 종료
		 * 반복문 종료 후 :없음
		 * 
		 * 방법2
		 * 반복횟수 : i는 num1부터 (num1*num2까지) num1씩 증가
		 * 규칙성 : i가 num2의 배수이면
		 * 		i를 출력 후 반복문을 종료
		 * 		=>i를 num2로 나누었을 때 나머지가 0 과 같다면
		 * 		i를 출력 후 반복문을 종료
		 * 반복문 종료 후 : 없음
		 * 10000 , 15000 일때
		 * 
		 * 10000 부터 시작해서 30000까지 3번 반복
		 */
		
		int num1, num2 ;
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 number:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	
		
		for (i=1;i<=(num1 *num2);i++) {
			
			if(i%num1 == 0 && i %num2 ==0) {
				System.out.println(i);
				break;
			}
		}
		for (i=num1;i<=(num1*num2);i=i+num1 ) {

			if(i%num2==0) {
				System.out.println(i);
				break;
			}
		}
	sc.close();
	}
}