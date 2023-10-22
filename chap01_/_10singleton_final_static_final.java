package chap01_;

public class _10singleton_final_static_final {

	public static void main(String[] args) {
		// 싱글톤 혼공자 36강
		// 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
		// 싱글톤 작성방법
		// 클래스 외부에서 new연산자를 통해 생성자 호출하는 것을 불가하도록
		// private 접근 제한자 사용
		// 자신의 타입인 Class이름과 정적 필드 선언 후 자신의 객체 생성해 초기화
		// private static 클래스이름 singleton = new 클래스이름();
		// 외부에서 호출할 수 있는 getInstance() 만들기
		// getInstance에서는 자신의 객체 리턴
//		static 클래스이름 getInstance() {
//			return singleton;
//		}

		// 메인에서 클래스이름 변수1 =클래스이름.getInstance();
		// 클래스이름 변수2 =클래스이름.getInstance();
		// 변수를 여러개 만들어서 genInstance를 호출해도
		// 힙영역에 객체는 하나만 생성되고 그 객체만 참조한다. (객체 공유)

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 singleton을 참조합니다");
		} else {
			System.out.println("다른 singleton을 참조합니다");
		}
		System.out.println("----");

		// final 상수
		Person person1 = new Person("111111-111111", "정준하");
		System.out.println(person1.nation);
		System.out.println(person1.ssn);
		System.out.println(person1.name);

//		person1.nation="USA"; 		final이라 값을바꿀수없음
//		person1.ssn="100000-100000";
		person1.name = "노홍철"; // 바꿀수있음

		// final 필드의 초기값 주는 방법
		// static필드일 경우(상수일경우)- 단순값일 경우 필드 선언시 초기화값을 씀
		// 인스턴스필드일 경우 - 객체 생성시 외부 데이터로 초기화가 필요한 경우
		// 생성자에서 초기화

		// 인스턴스 필드 final 필드 : ex)주민번호
		// 객체에 한번 초기화된 값을 변경 불가로 만듦
		// final String ssn; 생성자에서 초기화

		// 정적 final 필드 (관례적으로 모두 대문자로 작성)
		// 불변의 값을 저장하는 상수.
		// static final double PI = 3.14159;
		// static final double EARTH_RADIUS = 6400;

		System.out.println("지구의반지름: " + Person.EARTH_RADIUS + "km");
		System.out.println("지구의표면적: " + Person.EARTH_AREA + "km^2");

		// static과 final의 차이
		// static은 객체를 생성하지않고 쓰는 필드,메서드를 만들때 사용
		// 변하는 값은 인스턴스필드로 만들고 변하지않는 값은 static필드로 만든다
		// final을 쓰면 값을 바꾸지못한다
		StaticCalculator.pi = 3.14; // static은 바꿀수있다
		System.out.println(StaticCalculator.pi);
		// static final 을 같이쓰면 상수. 대문자로 상수를 쓴다

	}

}
