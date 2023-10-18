package chap01_.a;

public class A1 {

	int field1;

	void method1() {
	}

	static int field2;

	static void method2() {
	}

	class B1 { // 인스턴스멤버 클래스
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	} // 인스턴스멤버 클래스안에선 정적필드,인스턴스필드 모두 사용가능하지만
		// 정적멤버 클래스안에선 인스턴스필드는 사용불가

	static class C1 { // 정적멤버 클래스
		void method0() {
//			field1 = 10; 
//			method1();

			field2 = 10;
			method2();
		}
	}

	// 로컬 클래스에서 사용제한
	// 매개변수나 로컬변수를 로컬클래스에서 사용할때 매개변수나 로컬변수는
	// final을 쓰지않아도 특성부여돼있음

	public void method3(int arg) { // (final int arg)
		int localVariable = 1; // final int localVariable

//		arg=100;  		  값바꾸면 에러
//		localVariable =10;
		class Inner {
			public void method4() {
				int result = arg + localVariable;
			}
		}
	}

	// 중첩 클래스에서 바깥클래스 참조얻기
	// 바깥클래스.this.필드
	public String fi = "Outter - field";

	public void methodM() {
		System.out.println("Outter - method");
	}

	public class Nested { // 중첩클래스
		public String fi = "Nested - field";

		public void methodM() {
			System.out.println("Nested - method");
		}

		public void print() {
			System.out.println(this.fi);
			this.methodM();

			System.out.println(A1.this.fi); // 바깥클래스 필드 불러옴
			A1.this.methodM();
		}

	}

}
