package chap01_.implementation;

public class ImplementationC implements InterfaceC {
	// Interface A,B 를 상속받은 InterfaceC 를 구현함

	@Override
	public void methodA() {
		System.out.println("ImplementationC - methodA 실행");

	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC - methodB 실행");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC - methodC 실행");

	}
}
