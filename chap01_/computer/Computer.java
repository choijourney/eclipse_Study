package chap01_.computer;

public class Computer extends Calculator {
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
		// 메서드오버라이딩 부모객체의 3.14159가 정밀하지않아서
		// Math.PI로 오버라이딩함

		// @override를 쓰면 컴파일러가 override가 잘됐는지 검증한다
	}
}
