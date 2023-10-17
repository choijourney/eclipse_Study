package chap01_;

import chap01_.makecar.hankook.SnowTire;
//import chap01_.makecar.kumho.Tire;  클래스이름이 같을때 import하지않고
//import chap01_.makecar.hankook.Tire;   객체생성할때 전체이름씀
import chap01_.makecar.kumho.BigWidthTire;

public class _11 {
	// 클래스에서 다른 패키지에 있는 클래스 불러오기
	// 이름이 같은 클래스는 헷갈릴수 있어서 타입 자리에 전체이름을 써줘야함
	SnowTire snowTire = new SnowTire();
	BigWidthTire bigTire = new BigWidthTire();
	chap01_.makecar.kumho.Tire tire1 = new chap01_.makecar.kumho.Tire();
	chap01_.makecar.hankook.Tire tire2 = new chap01_.makecar.hankook.Tire();

	// 클래스에서 tire2.name 를 쓰려면 그냥 쓰면 안되고
	// 메서드 안이나 생성자에서써야함
	void method1() {
		tire2.name = "한쿡"; // name이 public필드라 사용가능
		System.out.println(tire2.name);
		tire1.size = "M";
	}

	public static void main(String[] args) {
		// 패키지 : 파일 시스템의 폴더 혼공자 39강
		// 클래스 이름이 동일하더라도 패키지가 다르면 다른 클래스로 인식
		// 클래스의 전체이름은 상위패키지.하위패키지.클래스 이렇게 표현.
		// chap01_._10 이클래스의 경우 왼쪽과같다
		// 외부에서 이 클래스를 사용할때 위와같이 클래스 전체이름을 써야한다

		// 패키지 선언 : 클래스 작성시 어떤 패키지에 속할 것인지 선언
		// 패키지 이름 규칙 : java로 시작하는 패키지는 자바 표준 API여서 사용불가
		// 두단어가 결합됐어도 모두 소문자로 작성하는것이 관례 ex) mycompany

		// import문 : 사용하려는 클래스 또는 인터페이스가 다른 패키지 소속일때 사용
		// 패키지 선언과 클래스 선언 사이에 작성
		// import 상위패키지.하위패키지.클래스이름;
		// import 상위패키지.B하위패키지.*;
		// * 하위패키지의 모든 파일을 불러오는데 B하위패키지안에
		// C하위패키지와 파일이 같이있다면 C하위패키지안의 모든파일을 불러온다

		// 다른패키지에 동일한 이름의 클래스가 있을때
		// import와 상관없이 클래스 전체 이름을 기술 ( import를 지우는게나음)

		// 접근제한 : 클래스에 쓸 수있는 접근제한자는 public,defalt뿐이다
		// public - 클래스,필드,생성자,메소드
		// protected - 필드,생성자,메소드
		// defalt - 클래스,필드,생성자,메소드
		// private - 필드,생성자,메소드

		// 생성자의 접근제한
		// 클래스앞에 접근제한을 붙이듯이 생성자 앞에도 접근제한을 쓸수있다
		// public은 전체패키지 공개, protected는 다른패키지여도 자식한텐 공개,
		// defalt는 같은패키지한테만 공개, private는 같은 클래스한테만 공개

		// 클래스가 public이더라도
		// 필드나 메서드도 public이어야 다른 패키지에서 쓸수있음
		// 필드 앞에 아무것도 안적으면 defalt여서 다른패키지에서 쓸수없음

		// getter 와 setter
		// 외부에서 객체에 마음대로 접근할 경우 객체의 무결성이 깨질수 있어서
		// 보통 필드를 private 으로 만들고
		// getter와 setter를 만들어 값에 접근함

		// setter 메서드
		// 외부값을 받아 필드값을 변경함, 매개값 검증을해서 유효한값만 필드로 저장.
//		void setSpeed(int speed) {
//			if(speed<0) {
//				this.speed= 0; 
//				return;	  메서드 종료하기위한 리턴
//			}else {
//				this.speed= speed;
//			}
//		} 매개값이 0보다 작으면 필드값을 0으로 설정.0보다크면 매개값을 필드값으로 저장

		System.out.println("----");
		// getter 메서드
		// 외부로 필드값을 전달. 필드값을 가공해서 외부로 전달할수있음
//		double getSpeed() {
//			double km = speed*1.6; 
//			return km;   
//		}	필드값이 마일이었는데 km로 환산후 외부로 리턴

		// 만약 getter만 있고 setter가 없는 필드의 경우
		// 값 변경이 안되는 읽기전용의 필드이다
		// 불리언타입의 getter는 is 로시작한다 ex) boolean isStop()

		chap01_.makecar.hankook.Tire tire = new chap01_.makecar.hankook.Tire();
		tire.setSpeed(55);
		System.out.println(tire.getSpeed()); // 55

		if (!tire.isStop()) { // false면 true로 만들어라 이런뜻
			tire.setStop(true); // setter에 true면 speed값 0으로설정
		}
		System.out.println("현재 속도 : " + tire.getSpeed());
	}

}
