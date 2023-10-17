package chap01_;

import chap01_.animal.Animal;
import chap01_.animal.Cat;
import chap01_.animal.Dog;
import chap01_.phoneabstract.SmartPhone;
import chap01_.remoteinterface.RemoteControl;
import chap01_.remoteinterface.Searchable;
import chap01_.remoteinterface.SmartTv;
import chap01_.remoteinterface.Tv;

public class _14 {

	public static void main(String[] args) {
		// 추상 클래스 선언 abstract
		// 추상클래스도 필드,생성자,메소드 선언할수있음
		// 직접 객체를 생성할수 없지만 자식객체가 생성될때 객체화됨
		// 자식 생성자에서 super() 형태로 추상클래스의 생성자 호출

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

		// 추상 메서드
		// abstract로 선언되고 중괄호가 없는 메서드
		// 메서드 선언만 통일하고 실행내용은 실체 클래스마다 달라야하는경우
		// 자식클래스에서 반드시 재정의해서 실행내용을 채워야함.

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();

		Animal animal = new Dog();

		animal.sound(); // 멍멍

		animal = new Cat();

		animal.sound(); // 미야오

		System.out.println("-----");
		animalSound(animal); // 미야오
		animalSound(new Dog()); // 멍멍
		animalSound(new Cat()); // 미야오

		// 인터페이스란 객체의 사용방법을 정의한 타입이다
		// 인터페이스를 이용해서 다형성을 구현할수있다
		// 인터페이스의 메소드를 호출하면 구현객체의 메소드가 호출된다
		// 개발코드를 수정하지않으면서 객체 교환이 가능하다

		// 인터페이스 선언 .java 형태의 소스 파일로 컴파일러를 통해 .class 형태로
		// 컴파일됨 클래스와 파일형태는 같으나 소스작성이 다름
		// 객체로 생성할수 없으므로 생성자를 가질수없음
		// 상수 필드만 선언 가능. 초기값을 꼭써야함
		// public static final var1 = 1;
		// public static final은 인터페이스 상수가 원래가지고있는 특성이라 생략해도된다

		// 상수이름은 모두대문자로 작성하고 다른단어로 구성돼있을경우 _언더바로 연결
		// int MAX_VOULME=0;
		// public static final이 디폴트로 숨겨져있어서 생략해도됨

		// 추상메서드를 써야해서 메소드 선언부만있고 중괄호실행문은 없다
		// int method1(); 앞에 abstract를 써도되고
		// 인터페이스가 abstract특성을 갖고있어서 보통 생략해서쓴다

		// 구현하는 클래스에서 인터페이스 상수를 사용할때는 인터페이스이름.상수 로쓰면됨
		// RemoteControl.MAX_VOLUME
		// 인터페이스는 변수타입을 인터페이스 이름으로 함
		RemoteControl rc;
		rc = new Tv(); // 인터페이스 변수에 구현객체를 저장
		rc.turnOn();
		rc.setVolume(60); // 50이 맥스볼륨으로 해놔서 60을 써도 50출력
		rc.turnOff();

		// 여러 인터페이스를 implements 해서 여러 인터페이스의 메서드를 가져와
		// 구현할수있다
		RemoteControl rc2 = new SmartTv();
		rc2.turnOn();
		rc2.setVolume(0);

		Searchable searchable = new SmartTv();
		searchable.search("utube.com");

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
