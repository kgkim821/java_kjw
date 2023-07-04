package day25.student.vo;

import java.util.HashSet;
import java.util.List;

public class test {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10.4,12.2));
	}
	//메서드 오버로딩 : 메서드명이 같고 매개변수가 다를때
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}