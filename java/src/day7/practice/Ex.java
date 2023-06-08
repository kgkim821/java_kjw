package day7.practice;

public class Ex {

	public static void main(String[] args) {

		/*
		 * 다음과 같이 출력되는 코드를 작성하세요
		 * a
		 * ab
		 * abc
		 * abcd
		 * 
		 * a......z
		 */
		
		
		/*
		 * 내부 반복문
		 * 반복횟수 : end 는 'a' 부터 시작해서 'z' 까지 1씩증가
		 * 규칙성 : 'a'부터 end 까지 출력 후 엔터
		 * 반복문 종료 후 : 없음
		 * 
		 * 
		 * 내부 반복문
		 * 반복횟수 : ch 는 'a'부터 시작해서 z 까지 1씩 증가
		 * 규칙성 ch 를 출력
		 * 반복문 종료 후 : 없음
		 */
		char ch='a',end ;
		int i,j ;
		
		for(end='a';end<= 'z' ; end++) {
		
		for (ch = 'a'; ch <= end; ch++) {
			System.out.print(ch);
			}
		System.out.println();
		}
	}
}
