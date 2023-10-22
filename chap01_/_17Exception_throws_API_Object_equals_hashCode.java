package chap01_;

import java.util.HashMap;

import chap01_.key.Key;
import chap01_.key.Member;

public class _17Exception_throws_API_Object_equals_hashCode {

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
		// main에서 throws 하면 main을 호출하는 jvm에서 e.printStackTrace 로 예외처리

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
		// 객체 비교 equals()메서드 String에 사용하는 equals랑 다름
		// equals메서드는 모든 객체가 매개변수로 대입될수 있음
		// 비교연산자인 == 와 동일. 참조를 비교함

		// 객체의 값이 같은지 비교하고싶을때 equals메소드를 재정의함
		// 비교하기전 객체가 동일 타입 객체인지 instanceof로 확인

		// equals메서드 외에 다른 Object메서드들도 오버라이딩 가능

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue1");

		boolean b = obj1.id.equals(obj2.id);
		System.out.println(b); // false
		// Member클래스에서 equals를 값이 같은지 비교하도록 재정의함
		// 여러 클래스마다 equals메서드를 오버라이딩해서 쓸수있다

		// 동등 객체 : 객체안의 값이 같을 때(필드 값이같을때) 동등객체라고함

		// hashMap은 Key가 같을때 중복값을 허용하지않고
		// 마지막에 새로 추가된 키-값을 사용한다 (앞에있던 키-값 지움)
		// 지우는 방법은 hashCode가 같은지 먼저 비교를 하고, 같다면
		// equals로 비교해서 true가 나오면 동등객체로 판단하고 지운다
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Key1", "value1"); // Key1 이 중복돼서 앞에있던 Key1을 지움
		map1.put("Key2", "value2");
		map1.put("Key1", "value3");

		System.out.println(map1.size()); // 2

		// 객체 해시코드 hashCode()
		// 객체를 식별하는 하나의 정수값
		// Object 클래스의 해시코드 메서드는 객체 메모리 번지를 이용해서 만듦
		// 객체마다 다른값. 그러니까 해시코드가 같으면 같은 객체이다.
		// 두 객체가 동등객체인지(객체안의 값이같은지) 비교할때
		// 해시 코드를 재정의

		HashMap<Key, String> map = new HashMap<>();
		map.put(new Key(1), "value1");
		map.put(new Key(2), "value2");
		map.put(new Key(1), "value3");

		System.out.println(map.size()); // 키값 쌍 개수
		// new Key로 새로운객체 키값 쌍 3개를 map에 추가

		// hashCode() 메서드에 number를 리턴하도록 재정의 (Key클래스에서)
		// hashCode에 number가 리턴돼서 1 2 1 이면
		// 1 과 1 은 같은객체로 봄
		// hashCode가 같으면 equals로 비교함

		// equals를 객체의 필드인 number가 같으면 true이도록 재정의
		// true가 나오면 동등객체로 판단해서 한번만 저장 하게 돼있음
		// 값을 떠나서 키로만 비교함
		// 그래서 map.size로 2가 나옴

		System.out.println("----");

		// 자바는 String이 같으면 같은 hashCode를 갖도록 돼있음. 그래서
		// hashCode를 return id.hashCode(); 로 재정의 (key.Member클래스에서)
		// id가 String타입이라 같은 id면 같은 객체로 봄
		// equals도 값이 같은지 비교하도록 재정의함

		HashMap<Member, String> map2 = new HashMap<>();
		map2.put(new Member("blue"), "value1");
		map2.put(new Member("red"), "value2");
		map2.put(new Member("blue"), "value3");
		// blue와 blue를 동등객체로 보고 처음 blue 삭제
		System.out.println(map.size()); // 2
	}

}
