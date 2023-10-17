package chap01_;

import chap01_.testprotected.Parents;

public class Testprotected extends Parents {
	public static void main(String[] args) {

		// protected Test
		Parents parents = new Parents();
		// parents.greet(); 에러
		// 부모클래스 객체를 만들고 그 객체변수로 부모메서드를 사용하려고하면 에러남

		Testprotected tests = new Testprotected();
		tests.pNumber = 10;
		tests.greet();
		// 자식클래스의 객체로 부모메서드 사용은 가능

		// 클래스에선 객체없이 바로 pNumber 필드나 메서드를 사용가능하고
		// 메인에선 객체를 만들고 객체변수.필드 이렇게 써야함
	}

	void greet2() {
		pNumber = 0;
		greet();
		System.out.println("protected 테스트 성공 ");
	}

}
