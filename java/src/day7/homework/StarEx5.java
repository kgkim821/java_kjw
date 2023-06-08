package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {

		/*
		 * 과제 
		 * 
		 * 출력되도록 코드를 작성
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		for (int i = 1;i<=4;i++) {

			for (int j=1;j<=5-i;j++) {
				System.out.print(' ');
			}
			for (int j=1;j<=i;j++) {
				System.out.print('*');
			}
			for (int j=1;j<=i-1;j++) {//j는 1부터 i-1 까지 출력
				System.out.print('*');
			}
			//엔터
			System.out.println();
			
		}
		for (int i = 1;i<=3;i++) {

			for (int j=1;j<=i+1;j++) {
				System.out.print(' ');
			}
			for (int j=1;j<=4-i;j++) {
				System.out.print('*');
			}
			for (int j=1;j<=3-i;j++) {//j는 1부터 i-1 까지 출력
				System.out.print('*');
			}
			//엔터
			System.out.println();
			
		}
		
	}
}
