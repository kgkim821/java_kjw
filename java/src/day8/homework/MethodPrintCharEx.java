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
		
	}
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
