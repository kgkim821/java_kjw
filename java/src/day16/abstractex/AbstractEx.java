package day16.abstractex;

public class AbstractEx {

	public static void main(String[] args) {
		//추상 클래스를 이용하여 객체를 만들 수 없다.
		/* 구현되지 않은 추상 메서드를 객체 생성후에 오버라이딩을 해주 면 가능.*/
		A a = new A() {
			public void test() {
			System.out.println("class A Test");
			}
		};
	a.test();
	A a2 = new A() {
		public void test() {
		System.out.println("class A Test");
		}
	};
	a2.test();
	
	/*추상 클래스를 상속받은 ChildA2는 일반 클래스이기 때문에 객체를 생성할수 있다.
	 *모든 기능이 구현되어 있다. => 개체 생성 가능
	 *모든기능이 구현되어 있지 않다 => 추상 메서드가 있다. => 객체 생성이 불가능 
	 */
	ChildA2 ca2 = new ChildA2();
	ca2.test();
	
	
	//다형성 - 하나의 객체에 여러 타입이 오는 것
	a =ca2; // 업캐스팅에 의해 c2 객체를 a가 다룰 수 있다.
	a.test();
	
	String str;
	}	
}



//리터럴과 상수의 차이
/*리터럴 1, abc , 0.5 
 * - 값이 변할 수 없는 숫자 자체 또는 문자열자체
 * 상수 : 값이 변하지 않는 변수 . 이름이 있는 리터럴
 * PI : 3.14 
 */

/*
 * 추상 클래스는 추상 메서드를 가지고 있고
 * 추상 메서드가 있는 클래스에 abstract를 붙이지 않으면 에러 발생
 */
abstract class A{ // 구현부 없음
	
	public abstract void test();
	//메서드에 final 이 붙이면 메서드 오버라이딩이 불가
	public final void test2() {
		System.out.println("Test2");
	}
}
/* 추상 클래스 상속 받는 방법 1.
/* 추상클래스 A를 상속받은 자식 클래스는 추상클래슬 만들어야함.*/
abstract class ChildA1 extends A{
	/*
	 * final 메서드를 오버라이딩 할 수 없음.
	public void test2() {
		
	}*/
}
/*추상 클래스 상속 받는 방법2
 * 부모 클래스의 추상 메서드를 오버라이딩해서 재정의 해줌
 */

//내용파악
class ChildA2 extends A{

	@Override
	public void test() {
		System.out.println("테스트");

	}
}

