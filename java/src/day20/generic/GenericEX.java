package day20.generic;

import java.util.ArrayList;

public class GenericEX {

	public static void main(String[] args) {
		Student<Integer> std = new Student<Integer>();
		std.kor = 10; //10.0 을 넣어주면 에러가 발생
		Student<Double> std2 = new  Student<Double>();
		std2.kor = 10.0;
		//ArrayList<String> list;
		//Student<Scanner> std3 = new Student<>();
		//
		print(std2);
		GenericEX.<Double>print(std2);
		GenericEX.print(std2);// std2가 Double로 되어 있어서 print의 T를 Double 이라고 추정할 수 있어서
	}

	//학생 정보를 출력하는 메서드
	public static<T extends Number> void print(Student<T> std) {
		System.out.println(std.grade);
		System.out.println(std.classNum);
		System.out.println(std.num);
		System.out.println(std.name);
		System.out.println(std.kor);
	}
	
}
