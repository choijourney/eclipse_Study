package chap01_;

public class Person {
	// final 필드의 초기값 주는 방법
	// static필드일 경우(상수일경우)- 단순값일 경우 필드 선언시 초기화값을 씀
	// 인스턴스필드일 경우 - 객체 생성시 외부 데이터로 초기화가 필요한 경우
	// 생성자에서 초기화
	final String nation = "Korean";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	// 정적 final 필드 상수를 대문자로작성
	// static final로 선언하면 불변의 값을 저장하는 상수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

}
