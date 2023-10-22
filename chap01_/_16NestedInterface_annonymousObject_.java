package chap01_;

import chap01_.button.Button;
import chap01_.button.CallListener;
import chap01_.button.MessageListener;
import chap01_.wake.Work;

public class _16NestedInterface_annonymousObject_ {
	public static void main(String[] args) {
		// 중첩 인터페이스
		// 클래스의 멤버로 선언된 인터페이스
		// 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기위함.
		// 인스턴스 멤버 인터페이스와 정적멤버 인터페이스 모두 가능함
		// 주로 UI프로그래밍에서 이벤트처리 목적으로 자주 활용함

		Button btn = new Button();
		// Button 객체를 만들고 setter로
		// 인터페이스 변수에 구현객체를 대입함
		btn.setOnClickListener(new CallListener());
		btn.click();

		Button btn2 = new Button();
		btn2.setOnClickListener(new MessageListener());
		btn2.click();

		// 익명 자식 객체, 익명 구현 객체
		// 클래스 이름이 없는 객체를 익명객체라고 함
		// 익명객체는 익명객체 내에서만 사용가능하고 밖에서는 사용할수없다
		// 하지만 오버라이딩한 메서드는 사용가능하다

		// 부모클래스 변수 = new 클래스이름1();
		// extends 상속받았을때 ↑ 자식 객체를 부모클래스 변수에 저장할수있는데

		// 부모클래스 변수 = new 부모클래스() { 여기에 객체내용};
		// ↑ 이렇게 자식객체없이 부모클래스로 만들고 {} 중괄호에 객체내용을 적는다

		// 인터페이스도 구현객체를 인터페이스 변수에 저장할수있다
		// 인터페이스 변수 = new 클래스이름2();

		// 인터페이스 변수 = new 인터페이스() { 여기에 객체 내용};
		// ↑ 이렇게 구현객체 없이 {} 중괄호에 객체내용을 적는다

		// 필드 선언할때 초기값으로 익명 자식 객체를 생성해서 대입
//		Parent field = new Parent() {
//			int childField;
//			void child() {}

//			@Override	 
//			void parentMethod() {}
//		}

		// 메서드 내에서 로컬 변수 선언시 초기값으로 대입
//		void method() {
//			Parent localVar = new Parent() {	
//				int childField;
//				void child() {}
//				
//				@Override	  
//				void parentMethod() {}
//			}
//		}

		// 매개변수의 매개값으로 익명자식 객체 생성하여 대입
//		void method1(Parent parent);
//		
//		void method2() {
//			method1(new Parent() {		
//				int childField;
//				void child() {}
//				
//				@Override	  
//				void parentMethod() {}
//			})
//		}

		// 익명 자식 객체의 멤버 접근 제한
//		Parent field = new Parent() {
//		int childField;
//		void child() {}

//		@Override	 
//		void parentMethod() {}
//	}
//		
//		void method() {	
//			field.childField=3;		안됨
//			field.child();			안됨
//			field.parentMethod();	가능
//		}
		// 익명객체로 정의한 중괄호의 내용은 부모객체에는 없는내용이다
		// 그래서 부모타입으로 만든 변수 field에서 접근할수없다
		// 익명객체는 익명객체 내에서만 사용가능하고 밖에서는 사용할수없다
		// 하지만 오버라이딩한 메서드는 사용가능하다

		Work work1 = new Work();
		work1.field.wake();
		// Work클래스의 field의 객체를 사용할거니까 work1.field
		// 오버라이딩한 wake는 사용가능하지만 work는 익명자식객체에만 있는 메서드라
		// 부모타입인 field로는 접근 불가
		work1.method1();
		// 메서드안에서 익명자식객체를 쓰면 final상수가 된다

		// 인수에 부모객체나 자식객체를 쓸수있다
//		work1.method2(new Wake() {  	// 익명자식객체 사용
//			void study() {
//				System.out.println("공부합니다.");
//			}
//
//			@Override
//			public void wake() {
//				System.out.println("9시에 일어납니다.");
//			}
//		});

		// Work가 자식객체가 아니어서 오류남
//		work1.method2(new Work());

//		메소드의 매개변수나 로컬변수를 익명 객체 내부에서 사용하는게 문제다.
//		메소드가 사라지면 매개변수, 로컬변수는 스택 메모리에서 사라져버리기 때문이다..
//		익명 객체에서 지속적으로 사용하지 못한다..
//		자바는 이 문제를 해결하기 위해 컴파일할 때 (저번에 살짝 본 내용)
//		익명 객체에서 사용하는 매개변수, 로컬변수의 값을 "익명객체 내부에 복사해두고" 사용한다.
//		-->매개변수, 로컬변수 값이 중간에 달라지면 안 되므로, 매개변수, 로컬변수를 final로 
//		선언할 것을 요구한다.
//
//		자바7이전: final을 명시해야 했음
//		자바8이후: final 쓰지 않아도 final의 특성을 부여함.

//		메서드 안에서 final테스트를 해봤는데 final특성이 아닌것같아보였다 왜? (Work클래스)

	}
}
