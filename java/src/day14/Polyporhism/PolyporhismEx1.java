package day14.Polyporhism;

public class PolyporhismEx1 {

	public static void main(String[] args) {

		/*매개변수의 다형성
		 * 리모컨으로 여러제품의 전원을 켜는 예제
		 * 제품 : TV , 에어컨 , 라디오
		 * 리모컨 클래스 , TV 클래스 , 에어컨 클래스 , 라디오 클래스
		 * 
		 */

		TV tv1 =new TV();
		Radio radio1 = new Radio();
		AirConditioner aircon = new AirConditioner();
		RemoteControl remocon = new RemoteControl();
		remocon.turnOn(tv1);//tv를 켜는 기능
		remocon.turnOn(aircon);//에어컨을 켜는 기능
		remocon.turnOn(radio1);//라디오를 켜는 기능
		
		System.out.println("==================");
		//매개변수의 다형성을 이용
		TV tv2 =new TV();
		Radio radio2 = new Radio();
		AirConditioner aircon2 = new AirConditioner();
		RemoteControl remocon2 = new RemoteControl();

		
		remocon2.turnOn(tv2);// 가전을 켜는 기능
		remocon2.turnOn(aircon2);// 가전을 켜는 기능
		remocon2.turnOn(radio2);// 가전을 켜는 기능
		//remocon2.turnOff(tv2);// 가전을 켜는 기능
		//remocon2.turnOff(aircon2);// 가전을 켜는 기능
		//remocon2.turnOff(radio2);// 가전을 켜는 기능
		
	}

}

class RemoteControl{
	public void turnOn(TV tv) {
		tv.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void turnOn(AirConditioner aircon) {
		aircon.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	public void turnOn(Radio radio) {
		radio.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
}

class TV{
	boolean power;
	int channel;
	void turnOn() {
		power = true;
	}
}

class AirConditioner{
	boolean power;
	double Currenttemperature;
	double desiredTemperature;
	void turnOn() {
		power = true;
	}
}

class Radio{
	boolean power;
	double frequency;
	void turnOn() {
		power = true;
	}
}

class HomeAppliances{
	boolean power;
	void turnOn() {
		power = true;
	}
	void turnOff() {
		power = false;
	}
}

class RemoteControl1{
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		appliance.turnOff();
		
	}
		
}

class TV1 extends HomeAppliances{
	boolean power;
	int channel;
	
}

class AirConditioner1 extends HomeAppliances{
	boolean power;
	double Currenttemperature;
	double desiredTemperature;
	
}

class Radio1 extends HomeAppliances{
	boolean power;
	double frequency;
	
}

