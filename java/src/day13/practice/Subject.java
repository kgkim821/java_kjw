package day13.practice;

public class Subject {
//엠버변수
	private String title;
	private double total;
	private double midTerm;
	private double finalTerm;
	private double performance;
	private int grade;
	private int semester;
//생성자
	
	public Subject(String title) {
		this.title=title;
		this.grade=1;
		this.semester=1;
		
	}
	
	public Subject(String title, int grade, int semester) {
		this.title = title;
		this.grade = grade;
		this.semester = semester;
	}
	
	
//매서드
	
	public void updateScore(int midTerm, int finalTerm, int performance) {
		this.midTerm = midTerm;
		this.finalTerm=finalTerm;
		this.performance=performance;
		total = midTerm+finalTerm+performance;
	}
	
	public void print() {
		System.out.println("title :" + title);
		System.out.println("grade :" + grade);
		System.out.println("semester :" + semester);
		System.out.println("midTerm :" + midTerm);
		System.out.println("finalTerm :" + finalTerm);
		System.out.println("performance :" + performance);
		System.out.println("total :" + total);
		
	}
}
