package chap01_.a;

public class A { // 중첩 인스턴스멤버 클래스
	public A() {
		System.out.println("A 객체가 생성됨");
	}

	public class B { // 인스턴스멤버클래스
		public B() { // 생성자
			System.out.println("B 객체가 생성됨");
		}

		public int field1; // 필드
//	 static int field2; 정적필드 선언불가

		public void method1() { // 메서드

		}
	}

	public static class C { // 정적멤버 클래스
		public C() { // 생성자
			System.out.println("C 객체가 생성됨");
		}

		public int field3; // 인스턴스필드 생성가능
		public static int field4; // 정적필드 생성가능

		public void method3() {
		}

		public static void method4() {
		}
	}

	public void method5() { // 로컬 클래스 : 메서드안에 만드는 클래스
		class D { // 메서드안에서만 사용가능한 클래스
			public D() {
				System.out.println("D 객체가 생성됨");
			}

			int field5;

//			static field6;    정적멤버 생성불가
			void method0() {
			}
		}
		D d = new D();
		d.field5 = 5;
		d.method0();
	}

	// A클래스의 접근제한을 보기위한 인스턴스 필드
	B bfield = new B();
	C cfield = new C();

	// 인스턴스 메소드
	void me() {
		B var1 = new B();
		C var2 = new C();
	}

	// 정적 필드 초기화
	// static B bf= new B(); 안됨
	static C cf = new C();

	// 정적 메소드
	static void me1() {
//		B var3 = new B();	 안됨
		C var4 = new C();
	}

}
