package day8.homework;

public class MethodPrintCharEx {

	public static void main(String[] args) {

		String str= "*";
		String str2= "?";
		String str3= "^";
		
		System.out.println(print5(str));
		System.out.println(print3(str));
		System.out.println(print5(str2));
		System.out.println(print7(str3));
		
		printString("*****");
		printChar ('*', 5);
		System.out.println();// 엔터를 밖에 지정
		printChar('*', 5, '\n');
		printChar('=',6,'\n');
		
		/*       *
		 *  	**
		 *     ***
		 *    ****
		 *   *****
		 */
		int num =5;
		for (int i=1;i<=5;i++) {
			// 공백이(' ') num - i개 출력
			printChar(' ',num - i);
			//'*' i개 출력 후 엔터
			printChar('*',i,'\n');
		}
		
	}

	/**문자열이 주어지면 주어진 문자열을 출력하고 줄바꿈 하는 매서드
	 * 매개변수 : 문자열 => String str
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printString
	 * 
	 */

	public static void printString (String str) {
		System.out.println(str);
	}
	/**문자와 개수가 주어지면 주어진 문자열을 출력하고 줄바꿈 하는 매서드
	 * 매개변수 : 문자와 개수 => char ch , int count
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printChar
	 */
	public static void printChar(char ch , int count) {
		for(int i=1;i<=count;i++) {
			System.out.print(ch);
		}
			
	}
	
	
	/**문자와 개수, 마지막 문자가 주어지면 주어진 문자를 개수만큼 출력하고 마지막 문자를 출력하는 매서드
	 * 매개변수 : 문자와 개수 , 마지막 문자 => char ch , int count, char lastch
	 * 리턴타입 : 출력된 문자열 = String
	 * 메서드명 : printChar
	 * 매서드 오버로딩 printChar 메서드 추가
	 */

	public static String printChar(char ch , int count, char lastCh) {
		String str = "";
		for(int i =1; i<=count; i++) {
			System.out.print(ch);
			str +=ch;
		}
		System.out.println(lastCh);
		str += lastCh;
		return str;
	}
		
	
	
	//
	public static String print5(String a){
		a=a+a+a+a+a;
		return a;
		}
		public static String print3(String a){
		a=a+a+a;
		return a;
		}
		public static String print7(String a){
		a=a+a+a+a+a+a+a;
		return a;
		}
}
