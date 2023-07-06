package day27.student.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day27.student.vo.Attendance;
import day27.student.vo.AttendanceBook;
import day27.student.vo.Student;

public class AttendanceController  {
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
	private AttendanceBook book = new AttendanceBook();
	
	List<Student> stuList = new ArrayList<>();

	public void printMenu() {

		System.out.println("1. 학생등록");
		System.out.println("2. 출석 체크");
		System.out.println("3. 출석 확인");
		System.out.println("4. 종료");
		System.out.println("메뉴 선택 :");
		
	}

	public void run() {
		
		int menu = 0;
		
		do {
			System.out.println("=============");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("=============");
		}while (menu != EXIT);
	}


	public void runMenu(int menu) {
		
		
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			attendanceCheck();
			break;
		case 3:
			printAttendance();
			break;
		case 4:
			break;
			default:
				System.out.println("wrong menu");
		}
	}



	private void insertStudent() {
		//정보 (학번 ,이름 )입력
		System.out.println("학번 :");
		String num = sc.next();

		sc.nextLine();
		System.out.println("이름 :");
		String name = sc.nextLine();
		
		//출석부에 새 학생을 추가
		//입력받은 정보를 이용하여 학생 객체를 생성
		Student std = new Student(num, name);
		//생성된 학생 객체를 추가
		boolean insertSuccess = book.insertStudent(std);
		
		//추가에 성공하면 성공했다고 , 
		if(insertSuccess) {
			
			System.out.println("학생 정보 추가 성공");
		}else {
			System.out.println("학생 정보 추가 실패!");
		}
		
	}

	

	private void attendanceCheck() {
		//날짜 입력
		System.out.println("날짜 (yyyy-MM-dd) :");
		String dateStr = sc.next();
		
		//날짜가 제대로 입력됐는지 체크
		//SimpleDateFormat을 이용
		Date date = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = format.parse(dateStr);
		} catch (ParseException e) {
			System.out.println("날짜 형식이 아닙니다.");
			return;
		}
		//출석부에서 학생 정보들을 가져와서 저장
		//=>AttendanceBook출석부에 학생정보들을 가져오도록 추가 작업
		List<Student> stdList = book.getStdList();
		
		
		//반복문
		for(Student tmp :stdList) {
			//학생정보를 출력
		System.out.println(tmp + " :");
			//학생의 출결을 입력(o or x)
		char state;
			//출석부에 체크
		do {
			state = sc.next().charAt(0);
		}while (state != '0' && state != 'X');					
		}
		//학생정보, 출결을 이용하여 출석 객체를 생성
			
			//출석부에 출석 객체를 추가
			//AttendanceBook에 출석 객체가 주어지면 출석명단에 추가하는 작업
			//생성자를 이용
	}
	
	private void printAttendance() {
		book.printAttendance();
		
	}
	public void load(String filename) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(filename))){
				while(true) {
					Student tmp = (Student)ois.readObject();
					stuList.add(tmp);
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
			System.out.println(stuList);
		
	}

	public void save(String filename) {
		//학생정보를 저장 => 리스트 => 하나씩꺼내서 저장
		//저장=>
		try(
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(Student tmp :stuList) {
				oos.writeObject(tmp);
			}
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}