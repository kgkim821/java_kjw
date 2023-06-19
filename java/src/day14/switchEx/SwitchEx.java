package day14.switchEx;

public class SwitchEx {

	public static void main(String[] args) {

		
		/*
		 * switch 문에서 case에 변수를 선언하면 다른 case 에서 선언할수 없다는걸 보여주는 예제
		* case 문에 break가 선택이지 필수가 아님
		* break가 없는 경우 다음 case의 실행문으로 이동
		 */
		
		int menu =1;
		switch (menu) {
		case 1 :
			String title = "name1";
			System.out.println(title);
			break;
		case 2 :
			String title2 = "name2"; 
			//System.out.println(title); // title 이 case 1 에 있어서 선언이 안됨
			//case 2 에서 title을 쓰면 에러 발생
			// title을 쓰기 위해서는 case 1을 반드시 지나야 하는데
			// menu 가 2이어서 case2가 보로 실행된 경우는 case 1을 건너뛰고오기 때문에 에러발생
			
			System.out.println(title2);
			
			break;
		case 3 :
			break;
		}
		
	}

}
