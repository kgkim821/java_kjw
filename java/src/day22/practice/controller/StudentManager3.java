package day22.practice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day20.practice.student.vo.Student;


public class StudentManager3 implements Program {

	List<Student> list = Arrays.asList(
			new Student (1,1,1,"Hong"),
			new Student (1,1,2,"Ling"),
			new Student (2,1,1,"Pard"),
			new Student (3,1,1,"Lee"),
			new Student (3,3,2,"kim")
			);
	private Scanner sc = new Scanner(System.in);
	private static final int Exit = 4;
	
	
	
	@Override
	public void printMenu() {
		
		System.out.println("1.ALL");
		System.out.println("2.Grade");
		System.out.println("3.Serarch ");
		System.out.println("EXIT ");
		System.out.println("Select :");
		
	}

	@Override
	public void run() {
		
		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while (menu != Exit);
		
		
	}

	@Override
	public void runMenu(int menu) {
	
		
		switch(menu) {
		case 1:
		
			
			break;
	
		case 2:
			System.out.println("grade : ");
			
			final int grade1 = sc.nextInt();
			break;
	
		case 3:
			System.out.println("grade : ");
			final int grade2 = sc.nextInt();
			System.out.println("class : ");
			
			final int classNum2 = sc.nextInt();
			System.out.println("number :");
			final int num2 = sc.nextInt();

			break;
			
		case 4:
			break;
			default:
		}
		
		
		
	}

	private void print(Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
}
