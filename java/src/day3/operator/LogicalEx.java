package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 85;
		//성적이(score) 60 점이상이고 , 성적이 90 점 미만인가?
		//score 가 80 보다 크거나 같고 score 가 90 보다 작다
		//score 가 80 보다 크거나 같다 && score가 90 보다 작다
		//score >= 80 && score < 90
		
		System.out.println(score+"점은 B학점인가?" + (score >= 80 && score < 90));
		int age =15;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//age 살은 미성년자인가?
		System.out.println("is" +age+"year old a minor? " +!isAdult);
		
		//주민등록증은 있고 , 운전면허증이 없음
		boolean	hasIdCard = false;
		boolean hasDriverCard = true;
		//토익을 볼수 있을까?(주민등록증이 있거나 운전면허증이 있으면 볼 수 있음)		
		System.out.println("Can I take TOEIC?" + (hasIdCard || hasDriverCard));
		}

}
