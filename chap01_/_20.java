package chap01_;

public class _20 {
	public static void main(String[] args) {
		// Wrapper클래스
		// 포장객체 기본타입의 값을 내부에 두고 포장
		// 포장하고 있는 기본타입 값은 외부에서 변경할 수 없음

		// Boxing : 기본타입의 값을 포장 객체로 만드는 과정
		// UnBoxing : 포장객체에서 기본 타입의 값을 얻어내는 과정

		// 박싱 valueOf()
		// 생성자를 이용할수도 있는데 deprcted될거다
		Integer obj1 = new Integer(100);
		// Wrapper클래스가 가진 static 메서드인 valueOf() 를 활용한다
		Integer obj2 = Integer.valueOf("300"); // 300을 Integer로 박싱
		Double d1 = Double.valueOf("300");
		Boolean b1 = Boolean.valueOf("true");

		// 언박싱 intValue() 활용. charValue,booleanValue 등 기본타입+Value
		int value1 = obj1.intValue();
		double value3 = d1.doubleValue();

		System.out.println(value3); // 300.0

		// 자동 박싱과 자동 언박싱
		// 자바 문법에 클래스타입에는 기본타입을 저장할수 없다.
		// 박싱을 해서 객체에 저장하고 번지를 참조해야한다.

		// Wrapper 클래스 타입에 기본값이 대입될 경우 자동박싱이 된다
		Integer obj = 100; // 자동 박싱
		int val = obj.intValue(); // 언박싱해서 int값을 가져옴

		// 기본타입에 객체를 대입하는 것은 문법에 맞지않지만,
		// 기본타입에 Wrapper클래스가 대입될 경우 자동 언박싱이 된다
		int iVal = obj + 100; // 자동 언박싱
		System.out.println(iVal); // 200

		// 문자열을 기본타입 값으로 변환
		// Integer 클래스의 parseInt메서드를 사용해서 문자열을 int로 바꿈
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");

		// Wrapper객체도 객체이기때문에 내부값을 비교할때 == !=를 사용하면 참조를 비교한다
		// 내부 값을 비교할때는 쓰지않는 것이 좋다.
		Integer ob1 = 300;
		Integer ob2 = 300;
		System.out.println(ob1 == ob2); // 다른객체를 참조해서 false
		// 그런데 범위에 따라 값을 비교할때도 있다.
		// boolean true false 나 char \u0000~ -u007f
		// byte,short,int -128~ 127 의 범위 일때는
		// 값이 같을때 참조객체를 하나만 만들어서 ==을 했을때 true가 나온다
		// 그러니까 위의 범위일때는 == !=를 써도 값을 비교하는 효과가 있다
		Integer ob3 = 10;
		Integer ob4 = 10;
		System.out.println(ob3 == ob4); // true

		// 그런데 범위를 따져가면서 == 을 쓰는것은 효율적이지않으니까
		// 객체 내부값을 비교할때는 equals() 메서드를 쓴다

		System.out.println(ob1.equals(ob2)); // true
		System.out.println(ob3.equals(ob4)); // true

		// 절대값 리턴
		int v1 = Math.abs(-5); // 5
		double v2 = Math.abs(-3.14); // 3.14

		// 올림값 (int는 안됨 double만됨)
		double v3 = Math.ceil(5.3); // 6.0
		double v4 = Math.ceil(-5.3); // -5.0
		System.out.println(v4);

		// 버림값 (내림값)
		double v5 = Math.floor(5.6); // 5.0
		double v6 = Math.floor(-5.3); // -6.0
		System.out.println(v5);

		// 최대값 리턴
		int v7 = Math.max(5, 9); // 9
		double v8 = Math.max(-5.3, -2.5); // 2.5
		System.out.println(v8);

		// 최소값 리턴
		int v9 = Math.min(5, 9); // 5
		double v10 = Math.min(5.3, 2.5); // 2.5

		// 랜덤값 0.0 ~ 1.0 미만의 실수
		double v11 = Math.random();

		// 가장 가까운 정수의 실수값
		double v12 = Math.rint(5.3); // 5.0
		double v13 = Math.rint(5.7); // 6.0
		System.out.println(v12);
		System.out.println(v13);

		// 반올림값을 long타입에 저장
		long v14 = Math.round(5.3); // 5
		long v15 = Math.round(5.7); // 6

		// 소수점 3번째 자리에서 반올림하기
		double v16 = 12.3456;
		double v17 = v16 * 100; // 1234.56
		double v18 = Math.round(v17); // 1235
		double v19 = v18 / 100.0; // 12.35
		System.out.println(v19);

		// 정수 랜덤숫자
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("random Number= " + num); // 1~10의 랜덤숫자

		int num1 = (int) (Math.random() * 11) + 9; // 9~20의 랜덤숫자
		System.out.println("random Number= " + num1);

		// Object 클래스의 메소드는 모든 자바 객체에서 사용가능
		// System 클래스 : 운영체제의 일부 기능을 이용할 수 있음. static으로 구성
		// Class 클래스 : 클래스와 인터페이스의 메타데이터가 Class 클래스로 관리됨
		// String 클래스 : String 클래스의 다양한 생성자를 이용해 직접 String 객체를 생성가능
		// Wrapper 클래스 : 기본 타입의 값을 갖는 객체를 포장객체라고함. 기본타입의 값을 포장객체로
		// 만드는 것을 박싱, 반대의 과정을 언박싱이라함
		// Math 클래스 : 수학계산에 사용할수있는 메소드를 제공하며, static이라 Math클래스와 도트연산자로
		// 사용가능

	}
}
