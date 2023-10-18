package chap01_;

import chap01_.airplane.SuperSonicAirPlane;
import chap01_.computer.Calculator;
import chap01_.computer.Computer;
import chap01_.phone.CellPhone;
import chap01_.phone.DmbPhone;

public class _12 extends CellPhone {
	public _12() { // 부모 생성자에 매개변수를 써야하는경우 자식클래스 생성자의
		super("애플", "블랙"); // super 매개변수에 부모생성자 매개변수를 써야함
	}

	public static void main(String[] args) {
		// 클래스 상속 extends 혼공자 41강
		// 자식 클래스 만들때 extends로 부모클래스 상속
		// 부모클래스에서 private인 필드와 메서드는 상속 안됨

		DmbPhone dmb = new DmbPhone("자바폰", "검정", 10);
		System.out.println(dmb.getModel());
		System.out.println(dmb.getColor());
		System.out.println(dmb.getChannel());
		// CellPhone을 상속받아서 DmbPhone객체만 생성해도 CellPhone메서드를
		// 쓸수있다
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세용");
		dmb.receiveVoice("안녕하세용 저는 홍길동입니다");
		dmb.sendVoice("아네 반갑습니다~");
		dmb.powerOff();

		dmb.turnOnDmb();
		dmb.changeChannel(15);
		dmb.turnOffDmb();

		// ?????
		// CellPhone에서 protected로 powerOn메서드를 만들고
		// 이 페이지 클래스에 CellPhone을 상속받아 powerOn메서드를 써봤다
		// main에서 안써지길래 main위 클래스공간에서 써봤는데도 에러났다

		// protected : 다른패키지여도 자식클래스면 상속이 가능하다
		// 클래스에서는 상속받고 쓰면 끝인데 메인에서 객체를 만들때
		// 부모클래스의 객체를 만들고 사용하면 에러가난다
		// 자식클래스의 객체를 만들어 사용하면 문제없다

		// 자식객체 생성시 부모객체가 먼저생성되고 자식객체가 생성됨
		DmbPhone dmb1 = new DmbPhone("삼성폰", "검정", 10);
		// DmbPhone 객체를 만든다고 썼지만 DmbPhone생성자 안에 super를
		// 써서 부모생성자와 객체를 먼저 만들고. 그다음 자식생성자,객체 만듦

		// super를 따로 안써도 컴파일러가 자동으로 super를 만듦

		// 부모 생성자에 매개변수를 써야하는경우 자식클래스 생성자의
		// super 매개변수에 부모생성자 매개변수를 똑같이 써야한다

		// 메서드 재정의 오버라이딩
		// 부모클래스의 메서드를 자식클래스에서 수정하여 사용
		// 부모 메서드와 동일한 시그니처를 가져야함
		// 타입,메서드이름,매개변수타입이 모두같아야함
		// 접근제한을 더 좁은범위로 재정의 할수없음 (예를들어 부모가 defalte인데
		// 자식이 private으로 할수없음. public은 가능)
		// 새로운 예외를 throws 할수없음
		// 메소드가 재정의될경우 자식객체의 메소드를 호출하면 재정의된
		// 메소드가 호출되고 부모객체의 메소드를 호출하면 부모메소드가 호출
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원면적 " + calculator.areaCircle(r));
		Computer computer = new Computer();
		System.out.println("원면적 " + computer.areaCircle(r));
		// Calculator 클래스가 한개 더있어서 import확인잘하기

		// ctrl+space 누르고 메서드이름을 입력하면 오버라이딩 자동완성

		SuperSonicAirPlane airPlane = new SuperSonicAirPlane();
		airPlane.takeOff();
		airPlane.fly();
		airPlane.flyMode = airPlane.SUPERSONIC;
		airPlane.fly();
		airPlane.flyMode = airPlane.NORMAL;
		airPlane.fly();
		airPlane.land();

		// 자식클래스내에서는 super.메서드 로 부모메소드를 호출할수있다

	}

}
