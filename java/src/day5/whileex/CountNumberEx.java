package day5.whileex;

public class CountNumberEx {

	public static void main(String[] args) {
/*
 * 1부터 10 까지 출력하는 코드를 작성하세요
 * 반복횟수 : i 는 1부터 i 가 10 까지 1씩증가
 * 규칙성 :  i를 출력 
 */
		
		int i =1;
		while (i<=10) { // i는 10까지
			System.out.println(i);
			++i; // i는 1씩 증가
		}
	}
}