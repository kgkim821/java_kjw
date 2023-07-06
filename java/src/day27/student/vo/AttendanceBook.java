package day27.student.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class AttendanceBook implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6838426533595000294L;
	private List<Attendance> list = new ArrayList<>();
	private List<Student> stdList = new ArrayList<>();
	
	
	public boolean insertStudent(Student std) {
		//이미 등록된 학번이면 등록 실패 : 학생 클래스가 하건을 통해서 같은지 확인할수 있어야함
		if(stdList.contains(std)) {
			return false;
		}
		stdList.add(std);
		//학번순으로 정렬
		Collections.sort(stdList,(o1,o2)->{
			return o1.getNum().compareTo(o2.getNum());
		});
		System.out.println(stdList);
		return false;
	}


	public boolean insertAttendance(Attendance attendance) {

		if(list.contains(attendance)) {
			return false;
		}
		list.add(attendance);

		
		return true;
	}


	public void printAttendance() {

		if(list.size()==0) {
			System.out.println("등록된 출석체크가 없습니다.");
			return;
		}
		//첫 출석 체크 정보의 날짜를 문자열로 가져옴
		String dateStr = "";
				
		for(Attendance tmp : list) {
			if(!dateStr.equals(tmp.getDateStr()))
			System.out.println(tmp);
			dateStr = tmp.getDateStr();
		}
	}
	
}
