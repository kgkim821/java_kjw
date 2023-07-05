package day25.student.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.student.vo.Student;

public class StudentController3 {

	private Scanner sc = new Scanner(System.in);
	private List<Student> list = new ArrayList<Student>();
	private Student pb;
	String filename = "";
	
	public void run() {
		
		int menu;
		
		load(filename);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택(메뉴를 입력받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != 3);
		save(filename);
		sc.close();
	}
	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
		System.out.println("4. 저장");
		System.out.println("5. 로드");
	}
	
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			//학생정보 입력
			insertStudent();
			break;
		case 2:
			//학생 전체를 확인
			print();
			break;
		case 3:
			break;
		case 4:
			load(filename);
			break;
		case 5:
			save(filename);
			break;
		default:
		}
	}
	
	public void insertStudent() {
		String num, name, major;
		Student tmp;
		//학번(문자열, 공백이 없는)
		System.out.print("학번 : ");
		num = sc.next();
		//이름(문자열, 공백이 있는)
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		//과(문자열, 공백이 있는)
		System.out.print("전공 : ");
		major = sc.nextLine();
		//학생정보 리스트에 저장
		//입력한 정보를 이용하여 학생 객체를 생성
		tmp = new Student(num, name, major);
		//리스트에 학생 객체를 추가
		list.add(tmp);
	}
	
	public void print() {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
	
	public void load(String filename) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(filename))){
				while(true) {
					Student tmp = (Student)ois.readObject();
					list.add(tmp);
				}
			} catch (FileNotFoundException e) {
				System.out.println("불러올 파일이 없습니다.");
			} catch (EOFException e) {
				System.out.println("불러오기 완료!");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				//objectInputStream을 객체단위로 이용하여 읽어올 때 클래스가 
				//serializable 인터페이스를 구현하지 않으면 발생 
				System.out.println("Student 클래스를 찾을 수 없습니다.");
			} 
			System.out.println(list);
		
	}

	public void save(String filename) {
		//학생정보를 저장 => 리스트 => 하나씩꺼내서 저장
		//저장=>
		try(
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(Student tmp :list) {
				oos.writeObject(tmp);
			}
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
}

