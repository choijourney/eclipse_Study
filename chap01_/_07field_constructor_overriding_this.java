package chap01_;

public class _07field_constructor_overriding_this {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 : 집합/사용 관계에 있는 객체를 하나씩
		// 설계한 후 조립하여 프로그램 개발
		// 예를 들어 자동차 객체를 만든다고 칠때 엔진객체,타이어 객체, 핸들객체가
		// 필요하다. 이런 부품과 완성품의 관계를 집합관계라고 한다
		// 다 만든 자동차 객체를 사람객체가 사용하는 것을 사용 관계 라고한다
		// 상속 관계는 상위 객체를 기반으로 하위객체를 생성하는 것이다

		// 클래스는 설계도이고
		// 설계도로 만드는게 객체이다
		// 인스턴스 : 클래스로부터 만들어진 객체

		// 클래스의 두 용도
		// 흔하게 만드는 public class Student 같은 클래스를 라이브러리 클래스
		// (API클래스) 라고 한다. 객체 생성 및 메서드 제공 역할
		// 또 하나, 메인메서드가 있는 실행클래스. 메인메서드로 실행하는 역할

		// 클래스 멤버 ( 필드,생성자,메서드)
		// 필드 : 객체의 데이터가 저장되는곳
		int fieldName;
		// 생성자 : 객체 생성시 초기화 담당
		// 메서드 : 객체의 동작에 해당하는 실행 블록

		// 클래스를 만들때 new연산자는 객체 생성을 하고 생성자를 호출하고
		// 객체 생성 번지를 리턴해 변수에 전달해줌

		// 필드 선언
		String company = "현대자동차";
		// 클래스 안에 선언된 변수는 필드라고 부른다 ( 변수와 형태는같지만 변수아님)
		// 같은 변수형태라도 생성자안이나 메서드 안에 있으면 필드라고 부르지 않고
		// 로컬변수(지역변수) 라고한다 그 중괄호안에서만 작동한다

		// 필드의 초기값은 만들어도 되고 생략 할수도있다
		// 초기값이 지정되지않은 필드는 객체 생성시 자동으로 기본 초기값이 설정됨
		// 기본타입은 0 으로 설정 , boolean은 false , 참조타입은 null

		// 필드 값 변경
		// 클래스 내부 생성자 및 메소드에서는 바로 변경 가능함
		int speed;
		speed = 0; // 이런식
		// 클래스 외부에서(예를 들어 메인메서드에서) 필드 값을 변경하는 경우
		// 클래스 객체를 생성한뒤 필드를 사용할 수 있다
		// Car myCar = new Car();
		// myCar.speed = 10 ;

		// 클래스 필드 사용
		Car car = new Car();
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		car.speed = 50;

		// field의 초기값들
		System.out.println(car.byteField); // 0
		System.out.println(car.shortField); // 0
		System.out.println(car.intField); // 0
		System.out.println(car.longField); // 0
		System.out.println(car.floatField); // 0.0
		System.out.println(car.doubleField);// 0.0
		System.out.println(car.booleanField);// false
		System.out.println(car.stringField); // null
		System.out.println(car.intArrField); // null 배열도 참조타입

		// 배열과 클래스 객체는 초기값을 갖고있다
		// 기본타입은 0 , 참조타입은 null, 불리언은 false

		// 생성자
		Car maCar = new Car("레드", 3000);// 생성자에 외부값을 이용할수있음
		// new Car() 로 생성자를 호출하고 객체를 만들어 힙영역에 저장한다
		// 스택영역에 변수를 저장하고 객체의 번지를 저장한다
		// 객체 초기화 : 필드를 초기화하거나 메서드를 호출해서 객체를 사용할 준비를 함

		// 생성자를 만들지 않아도 컴파일할때 컴파일러가 자동으로 생성자를 만든다
		// 기본형태로 Car(){};

		// 생성자가 필드를 저장하는 역할도 함
//		String name; 	클래스 필드
//		String socialId;
//		public Korean(String n, String s) { 생성자
//			name= n;
//			socialId=s; 
//		}

//		메인메서드에서 생성자호출할때 쓰는 인수값이 필드 name ,socialId에 저장됨 
//		Korean korean = new Korean("김자바","000000-000000");

		// 클래스에서 생성자를 만들때 매개변수 이름은 필드 이름과 비슷하거나
		// 동일한 것으로 쓰는게 좋다
		// 필드이름과 매개변수이름이 똑같을땐 자바에서 매개변수이름으로 처리한다
		// 그래서 this를 써서 구분한다
//		public Korean (String name,String socialId) {
//			this.name=name;
//		  내 필드에있는 name에, 매개변수 name값을 저장 
//		}

		// 생성자 오버라이딩 : 매개변수 개수가 다르거나 타입이 달라야함
//		Car(String model){		매개변수 이름이 달라도 개수가 같으면 
//			this.model= model	오버라이딩 안됨
//		}
//		Car(String color){
//			this.color= color
//		}

		// this는 생성자 중괄호 안에서 첫줄에 써야함
//		public Car() {
//			this("마젠타");	// 인수개수가 같은 Car를 가져와서 사용함
//		}
//
//		Car(String color) {
//			this("현대자동차", color);
//		}

	}

}
