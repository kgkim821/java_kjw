package day27.student.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Attendance implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3314113638504087582L;
	private Date date;//출석날짜
	private Student student; //학생정보
	private boolean attendance;//출석여부
	
	
	//출석일 , 학생 , 출석여부를 이용한 생성자
	
	public Attendance(Date date, Student student, char state) {
		this.date = date;
		this.student = student;
		this.attendance = state == 'O' ? true : false;
	}


	@Override
	public String toString() {
		return student.toString()+ " : " + (attendance?"0" : "X");

	}


	public String getDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return null;
	}
		
}
