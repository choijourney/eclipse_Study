package chap01_.computer;

public class Calculator { // 메소드 오버라이딩 Computer에게 상속해줌
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return 3.14159 * r * r;
	}
}
