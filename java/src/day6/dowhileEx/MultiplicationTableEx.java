package day6.dowhileEx;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//구구단 2단부터 9 단까지 출력하는 코드를 작성하세요.
		
/* 외부 반복문
 * 반복 횟수 :	i 는 2부터 9까지 1씩 증가.
 * 	
 */
		int i , j=1 ;
		
		for(i=2;i<=9;i++) {
			
			for(j=1;j<=9;j++) {
				/*
				 * i단 출력
				 * 내부 반복문
				 * 반복횟수 : j는 1 부터 9 까지 1씩증가
				 * 규칙성 : ixj = i*j 출력
				 */
				System.out.println(i+"x"+j+"="+i*j);
				}
			}
		//이 위치에서 i 와 j 이 값은 얼마 ? i : , j :     10 :10
	 	System.out.println(i +","+j);
	}
}
