package chap01_;

import chap01_.a.A;
import chap01_.a.A1;
import chap01_.implementation.ImplementationC;
import chap01_.implementation.InterfaceA;
import chap01_.implementation.InterfaceB;
import chap01_.implementation.InterfaceC;

public class _15 {

	public static void main(String[] args) {
		// 인터페이스는 다중상속가능
		// interface InterfaceC extends InterfaceA, InterfaceB

		ImplementationC imC = new ImplementationC();

		InterfaceA ia = imC; // 인터페이스타입에 구현객체 저장
		ia.methodA();

		InterfaceB ib = imC;
		ib.methodB();

		InterfaceC ic = imC;
		ic.methodA();
		ic.methodB();
		ic.methodC();

		// 중첩 클래스 : 클래스 내부에 선언한 클래스
		// 바깥클래스와 긴밀한 관계

		// 중첩 인터페이스 : 클래스 내부에 선언한 인터페이스

		// 선언위치에 따른 분류 - 멤버 클래스 , 로컬 클래스
		// 멤버 클래스 : 클래스의 멤버로서 선언되는 중첩클래스
		// 인스턴스멤버 클래스 , 정적멤버 클래스 로 나뉨

		// 로컬 클래스: 생성자나 메서드 안에서 선언되는 중첩클래스
		// 메서드안에서만 사용가능한 클래스
		// 생성자나 메서드가 실행할때만 사용됨

		// 인스턴스멤버 클래스
		// 인스턴스 필드와 메서드만 선언 가능하다
		// A객체가 있어야 B객체를 만들수있기때문에 static멤버를 선언할수없다
//		class A {
//			class B{	  인스턴스 멤버 클래스
//				B(){  }   생성자
//				int num;	필드
//				static num;  정적필드 선언불가X
//			}
//							A클래스 내부에서 B클래스 객체를 만들어 
//		void methodA() {	사용 가능
//			B b= new B();
//			b.num=3;
//		 }
//		}

		// A클래스 외부
		A a = new A(); // a패키지.A클래스 A객체 만든후
		A.B b = a.new B(); // B객체 만듦

		b.field1 = 3;
		b.method1();

		A.C c = new A.C(); // A객체가 없어도 클래스이름으로 바로 C객체 생성가능
		c.field3 = 4; // C객체생성해서 C클래스의 인스턴스멤버 호출

		A.C.field4 = 5; // 정적필드는 객체없이 클래스이름으로 호출가능
		A.C.method4();

		a.method5(); // 로컬클래스가 있는 메서드

		// 중첩클래스의 접근제한 . A클래스필드와 메소드에서 사용제한

//		public class A{
//			class B {	인스턴스 멤버 클래스
//				
//			}
//			
//			static class C { 	정적 멤버 클래스
//				
//			}
//			
//			// 인스턴스 필드
//			B field1 = new B();     
//			C field2 = new C();	    가능
//			 
//			// 인스턴스 메소드
//			void method1() {
//				B var1= new B();   
//				C var2= new C();   가능
//			}
//			
//			// 정적 필드 초기화
//			static B filed3 = new B();	 안됨
//			static C field4 = new C();	 가능
//			
//			// 정적 메소드
//			static void method2() {
//				B var1 = new B();		안됨
//				C var2 = new C();		가능	
//			}
//			
//		}  B클래스는 A클래스가 필요해서 A클래스가 필요하지않은 static으로
		// 만들수 없다.

		// 멤버 클래스에서 사용제한. 중첩클래스의 메서드안에서 사용제한
//		class A {
//			int field1;
//			void method1() {
//				
//			}
//			
//			static int field2;
//			static void method2() {
//				
//			}
//			
//			class B {
//				void method() {
//					field1 = 10;
//					method1();

//					field2= 10;
//					method2();
//				}
//			}
//			
//			중첩 인스턴스 클래스에선 인스턴스멤버,정적멤버 모두 접근가능하다
//			
//			static class C {
//				void method() {
//					field1 = 10;  안됨
//					method1();		안됨
//					
//					field2= 10;  정적필드 접근가능
//					method2();
//				}
//			}
//			B클래스는 A클래스가 필요해서 A클래스가 필요하지않은 
//			static 클래스 안에서 쓸수 없다.
//			
//		}
		System.out.println("----");

		// 로컬 클래스에서 바깥클래스 참조얻기
		// 바깥클래스.this.필드
		// A1.this.methodM(); a패키지.A1 보면있음
		A1 a1 = new A1();
		A1.Nested nested = a1.new Nested();
		nested.print();

	}

}
