package chap01_;

import chap01_.inherit.Child;
import chap01_.inherit.Parent;
import chap01_.tire.Cars;
import chap01_.tire.HankookTire;

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
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				cars.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				cars.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				cars.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------------");

		}

	}

}
