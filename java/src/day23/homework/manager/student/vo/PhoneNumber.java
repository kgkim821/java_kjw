package day23.homework.manager.student.vo;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

import lombok.Data;

//한사람의 전화번호
@Data
public class PhoneNumber implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6914872964580259399L;
	private String name;
	private String number; //010-1234-5678, 123456
	private String grade;
	
	public PhoneNumber(String name, String number , String grade) {
		this.name = name;
		
		this.number = checkNumber(number)?number:"";
		
		this.grade = grade;
		
	}
	
	//전화번호가 010-xxxx-xxxx 패턴이 맞는지 확인해주는 메서드
	//외부에서도 객체생성없이 쓸수 있게 static과 public을 붙여줌
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";
		return Pattern.matches(regex, num);
	}
	
	public void setNumber(String number) {
		this.number = checkNumber(number)?number:this.number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
		
}