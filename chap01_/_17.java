package chap01_;

import chap01_.member.Member;

public class _17 {

	public static void main(String[] args) {
		// 예외
		// 컴퓨터 하드웨어 관련 고장으로 응용 프로그램 실행 오류가 발생하는것 -> 에러
		// 그 외 프로그램 자체에서 발생하는 오류 -> 예외

		// 예외 : 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
		// 예외 처리 프로그램을 통해 정상 실행상태 유지 가능
		// 예외에는 일반예외와 실행예외가 있다

		// 일반예외 : 컴파일러가 실행전 체크하는 예외 , 예외발생가능성이 높아서 컴파일과정에
		// 예외 처리코드가 있는지 검사한후 처리하라고 알려줌
		// java.lang.Exception 이 모든 Exception의 부모이고 ClassNotFoundException 등
		// 일반예외가있다

		// 실행예외(RuntimeException) 컴파일러가 예외발생 체크를 못함. 실행 후 발생하는 예외
		// 개발자의 경험에 의해 예외처리를 해줘야함

		// 실행예외의 자식들
		// NullPointerException : 객체참조가없는데 참조변수로 객체접근 도트연산자를 사용할때발생
		// ArrayIndexOutOfBoundsException : 배열에서 인덱스 범위를 초과할때 발생
		// NumberFormatException : 문자열을 숫자로 변환할때 발생

		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0]; // 메인메서드 String[] args
			data2 = args[1]; // run configuration에서 추가가능

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(value1 + " + " + value2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생 두개값이 필요합니다!");
		} catch (Exception e) {
//		  catch (NumberFormatException e) { 
			System.out.println("숫자를 입력하세요.");
		} finally {
			System.out.println("이 실행문은 무조건 실행됩니다.");
		}
		// catch를 여러개쓸때 Exception을 쓰는경우 마지막에 써야함
		// 첫줄에 쓰면 다른 catch 실행문이 실행되지않음

		// throws 예외 떠넘기기 ( 예외도 클래스가 있음 )
		// 메소드에서 처리하지 않은 예외를 호출한 곳으로 넘김
		// 메소드를 호출한 곳에서 다양한 방식으로 처리할수 있도록함
		// throws 뒤에 떠넘길 예외클래스를 쉼표로 구분해나열 ClassNotFoundException,NumberFormatException
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
			// 어디서 무슨 예외가 발생했는지 콘솔에 보여줘서 개발할때 쓰면 좋음. 프로그램이완성되면 삭제
		}
		// main에서도 throws 처리를 할수있는데 실무에선 안씀
		// main에서 throws 하면 main을 호출하는 jvm(?)에서 e.printStackTrace 로 예외처리

	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		// Class.forName() 클래스를 찾는 메서드

		// java.lang 패키지
		// 는 자바 프로그램의 기본적인 클래스를 담은 패키지이다
		// java.lang의 클래스와 인터페이스는 import 없이 사용가능하다

		// java.lang 패키지의 클래스
		// Object : 자바 클래스의 최상위 클래스
		// System : 키보드로부터 데이터를 입력받을때 사용. 모니터로 출력할때 사용
		// 자바 가상 기계를 종료할때 사용. 쓰레기 수집기를 실행요청할때 사용
		// String : 문자열을 저장하고 여러가지 정보를 얻을때 사용
		// Wrapper : 기본타입의 정보로 객체를 만들때 사용. 입력값 검사에 사용
		// Math : 수학 함수를 이용할때 사용

		// 자바 API 매우중요함 개발할때 참고하면서 개발함
		// 자바 라이브러리라고도 함. 개발에 자주 사용되는 자바에서 제공하는 클래스 및 인터페이스 모음
		// API도큐먼트를 통해 사용방법을 확인할수 있다 (인터넷 주소)
		String str;
		// String을 선택한 후 F1 누르면 Help 뷰가 나옴
		// Javadoc for 'java.lang.String' 클릭하면 API도큐먼트 나옴

		// Object 클래스
		// 객체 비교 equals() String에 사용하는 equals랑 다름
		// equals메소드는 모든 객체가 매개변수로 대입될수 있음
		// 비교연산자인 == 와 동일. 참조를 비교함

		// 객체의 값이 같은지 비교하고싶을때 equals메소드를 재정의함
		// 비교하기전 객체가 동일 타입 객체인지 if로 확인

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue1");

		boolean b = obj1.id.equals(obj2.id);
		System.out.println(b);
	}

}
