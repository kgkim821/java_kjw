package day9.classEx;

public class Car {
	//멤버 변수(필드)
	private String name; 	//차명
	private String company;	//제조사
	private int year;		//연식 
	private int speed;	//속력
	private char gear;	//p:주차 R: 후진 D: 주행 , N : 중립
	private boolean power; // 전원
	
	//생성자
	public Car(String _name, String _company, int _year) {
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
	}
	
	//메서드
	/** 자동차 정보를 출력하는 메서드
	 * 매개변수 : 없음 
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printInfo
	* */
	
	public void printInfo() {
		System.out.println("VIEW");
		System.out.println("COMPANY : "+ company);
		System.out.println("MODEL 	:" + name);
		System.out.println("YEAR	:" + year);
		System.out.println("POWER	:" + (power?"on":"off"));
		System.out.println("GEAR	:" + gear);
		System.out.println("SPEED 	:" + speed);
		
		
	}
	/**속력이 1증가/1감소하는 메서드
	 * 매개변수 : 증가할건지 => boolean positive
	 * 리턴타입 : 없음
	 * 매서드명 :	speedChange
	 */
	
	public void speedChange(boolean positive) {
		//전원이 꺼져있으면 종료
		if(!power) {
			return;
		}
		//기어가 중립 또는 주차중이면 종료
		if(gear == 'N'|| gear =='P') {
			return;
		}
		//속력이 증가하는 경우이면 ,
		if (positive) {
			speed += 1 ;
		}
		//속력이 감소하는 경우이고 속력이 0보다 크면
		else if (speed > 0){
			speed -= 1 ;
		}
	}
	/**
	 * 자동차 시동을 켜거나 끄는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메서드명 : turn
	 */
	public void turn() {
		if(!power) {
			power = true;
		}else if (gear=='P') {
			power = false;
		}
	}

	public void setGear(char _gear) {
		gear = _gear;
	}
	
}

/*
 * 생성자 오버로드
 * 여러종류의 생성자를 만들수 있다.
 * 다양한 경우를 대비해서 초기화하기 위해
 * 
 * 멤버변수와 메서드호출
 * 객체명.멤버변수 = 값 ;//대체로 특별한 경우만 사용 //
 * 객체명.메서드명(매개변수들);
 * 
 * 
 * 
 * 일반적으로 생성자는 public 싱클톤의 경우 private 
 * this
 * 주로 생성자나 메서드에서 멤버 변수와 매개변수를 구분할 때 사용
 *  - 멤버변수와 매개변수 명이 같은 경우 사용(반드시 this를 사용)
 *  
 *  생성자가 여러개인 경우 다른 생성자를 호출할 때 사용
 *  다른 생성자 호출시 첫 라인에 써야 하며 다른라인에 쓰면 에러발생
 *  this() 사용시 무한 루프에 빠지지 않도록 조심해서 사용
 */