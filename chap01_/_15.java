package chap01_;

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
	}

}
