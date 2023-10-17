package chap01_;

import chap01_.driver.Bus;
import chap01_.driver.Driver;
import chap01_.driver.Taxi;
import chap01_.driver.Vehicle;
import chap01_.inherit.Child;
import chap01_.inherit.Parent;
import chap01_.tire.Cars;
import chap01_.tire.HankookTire;
import chap01_.tire.KumhoTire;

public class _13 {

	public static void main(String[] args) {
		// final 해당선언이 최종이며 수정될수 없음을 의미

		// 클래스앞에 final이 오면 부모가될수없다 상속할수없다
		// 메서드앞에 final이 오면 오버라이딩할수없다 재정의할수업다

		// 클래스 자동 타입 변환
		// 부모타입 변수에 자식타입을 저장해서 자동타입변환이 된다
//		Cat cat = new Cat();
//		Animal animal= cat;
//		Animal animal = new Cat(); 도 가능
		// 그러면 스택영역에 cat이 힙영역의 Cat객체를 참조,
		// animal도 Cat객체를 참조한다

		// 바로 위 부모가 아니더라도 상속 계층에서 상위 타입인경우 자동타입변환 가능
		// A 부모 -> B 상속 -> C 상속
		// A a= new C(); A타입으로 변환

		// 부모타입으로 자동타입변환 이후에는 부모클래스에 선언된 필드,메소드만
		// 접근가능. 자식클래스 메소드 접근불가. 예외적으로, 부모의 메소드가
		// 자식클래스에서 재정의 될경우 자식클래스의 메소드가 호출. @

//		Parent parent =new Child();
		Child child = new Child();
		Parent parent = child;

		parent.method1(); // 부모메서드 호출
		parent.method2(); // 자식클래스에서 오버라이딩돼서 자식메서드호출
//		parent.method3();	// 자식메서드 사용불가.

		// 다형성 : 객체 사용방법은 동일하나 메소드재정의와 타입변환으로
		// 실행결화가 다양하게 나오는 성질.
		// 필드의 다형성
		// 필드 타입을 부모타입으로 선언할경우
		// 다양한 자식객체가 저장되어 필드사용 결과가 달라질수있음
		Cars cars = new Cars();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = cars.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				cars.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break; // 필드타입을 부모타입으로 선언
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				cars.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				cars.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				cars.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
		}
		System.out.println("----------------------------------");

		// if문 안에 함수가 있으면 함수를 실행한 후 false와 비교한다
		// if문안의 함수에 sout이 있으면 출력된다
		// if (frontLeftTire.roll() == false)

		// 클래스 클릭한번한상태로 ctrl+c로 ctrl+v 하고 클래스이름 재정의하면
		// 클래스가 복사된채로 하나더생김(클래스이름은 재정의한이름으로 바뀌어서)
		// 오버라이딩할때 아주좋을듯

		// 매개 변수의 다형성
		// 매개변수를 부모타입으로 선언
		// 메소드 호출시 매개값으로 부모 객체 및 모든 자식 객체를 제공할수있음
		// 자식이 메소드를 재정의 했을경우 재정의한 메소드 호출

		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.driver(vehicle);
		// 메서드 매개변수에 자식객체변수를 써도된다
		driver.driver(bus);
		driver.driver(taxi);

		// 객체도 강제 타입변환 가능하다
		// 자식타입이 부모타입으로 자동타입변환 후 다시 반대로 변환할때만 가능.
		// Parent parent = new Child(); 자동타입변환
		// Child child = (Child) parent; 강제타입변환

		// 이런 강제타입변환이 필요한 경우는.

//			Class Parent{
//				String field;
//			}
//
//			Class Child extends Parent{		상속받음		
//				String field2;
//			}

		// Parent parent= new Child();
		// 부모타입으로 자식타입객체를 만들었을때 부모객체의 필드만 사용할수있다
		// parent.field 가능 parent.field2 불가능

		// 자식객체의 필드를 사용하고 싶을때 강제형변환을한다
		// Child child = (Child) parent;
		// child.field2 가능
		// 단,부모객체메서드를 자식객체에서 오버라이딩했을땐 자식메서드 호출

		// instanceof 연산자
		// 타입을 확인하지않고 강제 타입 변환 시도시 ClassCastExecption
		// 이 발생할수있음 instanceOf를 통해 확인후 안전하게 실행
		// boolean result = parent instanceof Child
//			
//			public void method(Parent parent) {
//				if(parent instanceof Child) {
//					Child child = (Child)parent;
//				}
//			}	parent매개변수가 참조하는 객체가 Child인지 조사후 타입변환

	}

}
