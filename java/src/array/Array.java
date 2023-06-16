package array;

public class Array {

	public static void printArray(int arr[]) {
		System.out.print("[");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ (i==arr.length-1?"":","));
		}
		System.out.println("]");
	}
	
	//배열을 start 번지부터 end-1 번지까지 출력 
	public static void printArray(int arr[], int start , int end) {
		System.out.print("[");
		for (int i=start; i < end; i++) {
			
			if(i >= arr.length) {
				break;
			}
			System.out.print(arr[i]+ (i==end-1?"":","));
		}
		System.out.println("]");
	}
	
	
	public static boolean contains(int arr[], int num ,int count) {// static 
		for(int i=0;i<count;i++) {
			//중복되면 매서드를 종료하면서 중복됐다고 알려줌.
			if(num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	//num가 배열의 원소 중에서 0 번지부터 count개 안에 있는지 확인하는 매서드
	public static int [] createRandomArray (int min, int max, int arr[]) {
		// max가 min 보다 작으면 두 수를 교환
		if(max <min) {
			int tmp = max;
			max = min ;
			min = tmp;
		}
		
		
		if(arr ==null) {
			arr =new int[max -min + 1];
		}

		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max- min +1 < arr.length) {
			return null;
		}
		
		int count =0;
		while(count < arr.length) {
			int random=(int)(Math.random() * (max-min+1)+min);
			//이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여
			//있으면 반복문 종료
			if (!contains(arr, random, count)) {
				arr[count] = random;
				count++;
			}
		}
		return arr;
	}
	/**주어진 배열에 중복된 값이 있는지 없는지 알려주는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : 중복여부
	 * 메서드명 : arrayCheck
	 */
	public static boolean arrayCheck(int arr[]) {
		if (arr == null) {
			return false;
		}
		//arr 배열의 다른 번지들끼리 비교해서 같은 값이 있는지 확인하는 반복문
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j ++) {
				//같은 번지면 건너뜀
				if (i==j) {
					continue;
				}
				//다른 번지이고 값이 같으면 중복됐다고 리턴
				if (arr[i]==arr[j]) {
					return true;
				}
			}
			//반복문이 끝날때까지 중복이 안되면 중복이 안됐다고 리턴
		}return false;
	}
	
	/**정수형 배열이 주어지면 오름차순으로 버블 정렬하는 메서드
	 * 매개변수 : 정수형 배열 => int arr[]
	 * 리턴타입 : 없음 => void
	 * 메서드면 : sort 
	 */
	
	public static void sort(int arr[]) {
		if (arr == null) {
			return;
		}
		for(int i =0; i< arr.length-1; i++) {
			for (int j = 0 ; j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
}

