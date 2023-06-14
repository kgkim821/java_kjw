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
		// 두 배열을 교환
		
		System.out.println("==================");
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		temArr= arr1;
		arr1 = arr2;
		arr2=temArr;
		
		//매개변수로 넘겨준 배열의 주소가 매서드 안에서 바뀌면 원본이 영향이 없음
		swap(arr1,arr2);
		
		//매개변수로 넘겨준 배열의 주소가 매서드 안에서 바뀌면 원본이 영향이 없음
		
		swap2(arr1,arr2);
		System.out.println("===================");
		int arr3[] = {1,2,3,4};
		printArr(arr3);
		test1(arr3);
		printArr(arr3);
		
		System.out.println("===================");
		int arr4[] = {1,2,3,4};
		printArr(arr4);
		test1(arr4);
		printArr(arr4);
		
		
	}
		
	public static void test1(int arr[]) {
		//기존 배열을 버리고 새로운 배열을 만듬
		// => main 에서 연결되었던 배열과 연결이 끊김
		arr = new int [4];
		arr[0] =3;
	}
	
	public static void test2(int arr[]) {
		arr[0] =3;
	}
	
	public static void printArr(int arr[]) {
		for(int num : arr) {
			System.out.print(num + " ");
			}
			System.out.println();
		}
	/**두 배열을 교환하는 메서드2 : 교환이됨
	 *  
	 */
	public static void swap2(int arr1[], int arr2[]) {
		int tmp[] = new int [arr1.length];
		for (int i =0; i<arr1.length; i++) {
			tmp[i] = arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=tmp[i];
		}
		
	}
	
	
	/**두 배열을 교환하는 메서드1 : 교환이됨
		 *  
		 */
	public static void swap (int arr1[], int arr2[]) {

		int temArr[] = arr1;
		arr1 = arr2;
		arr2= temArr;
		
	}
	
	

/** 두 정수의 값을 교환하는 메서드 : 교환이 안됨 */
/* 
 * 매개변수 num1과 num2는 메서드가 호출되면 새로 변수를 만들어서
 * 호출한 곳에서 넘겨준 값을 복사해 옴. ( 복사본으로 메서드를 실행)
 * 	
 */
	public static void swap (int num1, int num2) {
		
	}
	
}
