package day13.practice;

public class SubjectEx {

	public static void main(String[] args) {
		
		Subject sub1= new Subject("kor"); 
		sub1.print();
		
		Subject sub2= new Subject("lan",2,4);
		sub2.updateScore(30, 40, 50);
		sub2.print();
		
	}

}
