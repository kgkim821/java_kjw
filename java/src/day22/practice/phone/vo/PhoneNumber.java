package day22.practice.phone.vo;

import java.util.Objects;
import java.util.regex.Pattern;

import lombok.Data;

//한사람의 전화번호
@Data
public class PhoneNumber {

	private String name;
	private String number;//010-1234-1234 '-'문자열로 선언 
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = "";
		if(checkNumber(number)) {
			this.number = number;
		}
		this.number = checkNumber(number)?number : "";
	}
	
	//전화번호가 010-xxxx-xxxx패턴이 맞는지 확인해주는 메서드
	//외부에서도 객체생성없이 쓸수 있게 static 과 public 을 붙여줌
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";
		return Pattern.matches(regex,num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	public void setNumber(String number) {
		this.number = checkNumber(number)?number : this.number;
		
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


	
}
