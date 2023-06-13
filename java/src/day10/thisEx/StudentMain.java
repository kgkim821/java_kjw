package day10.thisEx;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		
		
		Student1 std1 = new Student1(1,1,1,"hong");
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"lim");
		Student1.printCount();
	
		//std2.studentCount=1;
		//System.out.println(std1.studentCount);
		std1.print();
		//Student1.print();//에러발생. static 이 print에는 안붙어서
		std2.print();
		System.out.println(std1);
		System.out.println(std2);
	}

}
class Student1{
	static int studentCount;
	private int grade, classNum, number;
	private String name;
	//아래 생성자는 매개변수가 있고 , 매개변수의 이름이 멤버변수와 같기 때문에
	//멤버 변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
	
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;
	}
	//기본 생성자는 매개변수가 없기 때 문에 this를 안써도 됨.
	public Student1() {
		
		//멤버변수와 이름이 같은 지역 변수를 만들수도 있다.(비추천)
		//int grade =10;
		
		//this(1,1,1,"");//순서 주의.
		name = " ";
		
		/*this.grade =1;
		classNum =1;
		number =1;
		name = " ";*/
		
	}
	
	public void print() {
		System.out.println("===============");
		System.out.println("grade 		:" + grade);//객체 변수 사용 가능
		System.out.println("classNum	:"+ classNum);
		System.out.println("number		:"+ number);
		System.out.println("name		:"+ name);
		//클래스 변수 사용 가능
		//System.out.println("count       :"+studentCount);
		//클래스 매서드 사용가능
		//printCount();
	}
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Registered student count :" + studentCount);
		//객체 변수 사용 불가능(직접)
		//grade =1;
		//객체 메서드 사용 불가능(직접)
		Student1 std1 = new Student1();
		std1.name="hong";
		std1.print();
		
	}
}

/*
 * 지역변수
 * 메서드에 선언된 변수
 * 선언된 범위 안에서 사용가능. 벗어나면 사용 불가능
 * 
 * 멤버변수
 * 객체변수 
 * 힙 메모리에 생성
 * 객체가 gc에 의해 수거될 때 해제됨
 * 클래스 안에 있는 모든 개게 메서드
 */