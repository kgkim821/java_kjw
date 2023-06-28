package day20.practice.student.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor
public class Student {
	private int grade, classNum, num;
	private String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && Objects.equals(name, other.name)
				&& num == other.num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, name, num);
	}
	
	
}