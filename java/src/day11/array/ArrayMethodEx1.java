package day11.array;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		//매서드의 메개변수와 관련 예제.
		
		int num1 =10 , num2 = 20;
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		System.out.println("========================");
		
		num1 =10 ;
		num2 =20 ;
		
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		swap(num1, num2);
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		
		int arr1[]= {1,2,3,4};
		int arr2[] = {5,6,7,8};
	
		
		int temArr[] = new int [arr1.length];
		
		
		
		}
		
	

/** 두 정수의 값을 교환하는 메서드 */
/* 
 * 매개변수 num1과 num2는 메서드가 호출되면 새로 변수를 만들어서
 * 호출한 곳에서 넘겨준 값을 복사해 옴. ( 복사본으로 메서드를 실행)
 * 	
 */
	public static void swap (int num1, int num2) {
		
	}
	
}
