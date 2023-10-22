package chap01_;

public class _09method_overloading_instanceMember_staticMethod {

	public static void main(String[] args) {
		// 메서드안에 메서드 사용하기
		Calculator myCalc = new Calculator();
		myCalc.execute();

		// Car 클래스 메서드 사용
		Car car = new Car();
		car.carTurnOn();
		car.carRun();
		int speed = car.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h ");

		// double매개변수에 int매개변수를 썼을때
		int x = 10;
		double y = 20.3;
		// 아래 plus메서드에 대입해보면
		// x는 int고 y는 double 이지만 int가 double로 자동형변환이 가능해서
		// 에러 없이 작동한다

//		double plus(double x, double y) {
//			double result = x + y;
//			return result;
//		}

		// 메소드 오버로딩
		// 메서드 타입은 달라도됨, 매개변수타입이 다르거나 개수가 달라야함
		// int power(int x, int y) {..}  이름이 달라도 오버로딩 안됨
		// double power(int j, int k) {..} 컴파일오류

		Calculator cal = new Calculator();

		double rectangle = cal.areaRectangle(10);
		double rectangle1 = cal.areaRectangle(10, 14);

		System.out.println("정사각형 너비는 : " + rectangle);
		System.out.println("직사각형 너비는 : " + rectangle1);

		// 테스트였음
//		int c = 0;
//		while (true) {
//			c++; // 1을 더함
//			if (c == 0) { // c=1 이니까 무한루프
//				break;
//			}
//			System.out.println(c + "!!");
//		}
//		System.out.println("와일문끝");
		// 프린트문이 아예시작하지못한다 / while문이계속반복된다 /
		// c가 0일경우 해당문장을 건너뛰고 다음문장을 수행한다

//		int n = 0;
//		while (n < 10) {
//			System.out.println(n);
//		}
		// 무한루프 / 0123456789 에 낚였음

		System.out.println("-----");
		// 인스턴스 멤버 - 객체를 생성후 사용할수있는 필드와 메서드
		// 객체마다 가지고 있는 멤버
		// 인스턴스 필드 : 객체마다 다른데이터 저장
		// 인스턴스 메서드 : 객체가 있어야 호출 가능함, 객체마다 가지고있는 메서드
		// 코드가 힙영역이아닌 메서드영역(클래스코드) 에 위치하지만
		// 객체가 없으면 호출할수 없기때문에 인스턴스 멤버이다

		// 정적 멤버 (클래스에 고정된 멤버)
		// 객체와 상관없는 멤버, 메서드영역(클래스 코드)에 위치
		// 정적 필드 및 상수 : 객체 없이 클래스만으로도 사용 가능한 필드
		// 정적 메서드 : 객체없이 클래스만으로 호출 가능한 메서드

		// this : 객체 내에서 인스턴스 멤버에 접근하기 위해 사용
		// 생성자와 메서드의 매개변수 이름이 필드와 동일할때 사용

		// static 멤버를 불러올때는 클래스이름.변수or메서드 로 불러옴
		// .으로 메서드 불러오는것을 도트연산자 라고함
		double circle = 5 * 5 * StaticCalculator.pi; // 원너비
		int plusResult = StaticCalculator.plus(10, 5);
		int minusResult = StaticCalculator.minus(10, 5);

		System.out.println(circle);
		System.out.println(plusResult);
		System.out.println(minusResult);
		// 인스턴스 멤버와 정적 멤버 선택기준
		// 객체마다 다를 수 있는 필드 값은 인스턴스 필드로 만들기
		// 객체마다 다를 필요가 없는 값(pi같은값) 은 정적 필드로 만듦
		// 메서드안에 인스턴스필드 혹은 인스턴스 메서드를 사용할때
		// 인스턴스 메서드로 선언
		// 그렇지 않을때 정적 메서드로 선언

		// 정적메서드 선언시 주의점
		// static 메서드 선언시 내부에 인스턴스필드 및 메서드 사용불가
		// this 사용불가
		// 정적메서드는 객체생성없이 쓰는 메서드기때문.

		// 정적 메서드에서 인스턴스 멤버를 사용하려면
		// 객체생성 후 참조변수로 접근
//		static void method1() {
//			Car car = new Car(); 
//			car.model="벤츠";
//			car.run();
//		}

	}

}
