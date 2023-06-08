package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {

		//a부터 z까지 출력하는 코드를 작성하세요.
		
		//'a' + 정수 => int
		//'a'에 1을 더하면 'b'
		//'a'에 2를 더하면 'c'
		//'a'에 3을 더하면 'd'
		//....
		//'a'에 25를 더하면 'z'
		/*
		 * 'a'에 25를 더하면 'z'
		 * 바복횟수 i는 0부터 26보다 작을 때 까지 1씩증가
		 * 규칙성 : 'a'에 i를 더한 값을 문자형으로 자료형변환해서 출력
		 * 반복문 종료 후 : 없음
		 */
		
		char ch='a' ;
		int i ;
		
		//방법 1
		for (i=0; i < 26; i++) {
			System.out.println((char)(ch + i));
		}
		
		//방법 2
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
