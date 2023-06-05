package day5.whileex;

public class HelloWordEx {

	public static void main(String[] args) {
		//Hello world 를 10번 출력하는 코드를 작성하세요
		System.out.println("Hello world");
		/*
		 * 반복횟수 : 10 번 , 1번 부터 10 번까지 1씩 증가
		 *  => 변수의 초기값 : 1
		 *  => 조건식 : 10 => 10 보다 작거나 같을때까지
		 *  => 증가하는 식 : 1씩 증가
		 * 규칙성 : Hello world 를 출력
		 * => 실행문
		 */
		
		int max = 3;
		int i =1; //변수의 초기값 : 1
		while (i <= max){
			System.out.println("Hello world");
			++i;
		}
		System.out.println("===============================");
	/*
	 * 반복횟수 : i 는 10 부터 1까지 1씩 감사
	 * 
	 */
	i = max;
	while (i>=1) {
		System.out.println("Hello world");
		--i;
	}
	System.out.println("===============================");
	i = max;
	while (i-->=1) {
		System.out.println("Hello world");
	}
	}
}
