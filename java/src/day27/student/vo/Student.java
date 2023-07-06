package day27.student.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import lombok.Data;


@Data
public class Student implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3808601629411418437L;
	/**
	 * 
	 */
	
	private String num;
	private String name;
	
	public Student(String num, String name) {
		this.num = num;
		this.name = name;
	}

	// 학번으로만 객체가 같은지 판별
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(num, other.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num); 
	}

	@Override
	public String toString() {
		return num + " " + name;
	}
	
}
