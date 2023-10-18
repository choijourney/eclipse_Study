package chap01_.wake;

public class Work {
	public Wake field = new Wake() {
		public void work() {
			System.out.println("출근 합니다.");
		}

		// 부모클래스 오버라이딩
		public void wake() {
			System.out.println("6시에 일어납니다.");
		};
	};
	// 오버라이딩한 메서드는 사용가능하지만 work는 익명자식객체에만 있는 메서드라
	// 부모타입으로 선언한 field로는 접근 불가하다

	public void method1() {
		// Wake 변수는 final상수임
		Wake field6 = new Wake() { // new Wake부터 익명자식객체
			public void walk() {
				System.out.println("산책합니다.");
			}

			public void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}; // field6는 부모타입변수라 자식객체에 접근을 못해서
		}; // 부모메서드를 재정의한 wake안에 자식메서드인 walk메서드를 썼다
		field6.wake();
	}

	// 매개변수에 익명자식객체를 써서 자식객체의 오버라이딩한 wake메서드 사용
	public void method2(Wake wake) {
		wake.wake();
	}

}
