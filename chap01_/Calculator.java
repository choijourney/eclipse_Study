package chap01_;

public class Calculator {
//
	void powerOn() { // 리턴값없을때 void를 써줌
		System.out.println("전원을 켭니다");
	}

	int plus(int x, int y) { // return값이 int일때 int를 써줌
		return x + y;
	}

	double devide(int x, int y) {
		return (double) x / y; // int끼리 나누면 int정수가 나오니까
	} // double로 형변환시킨후 나누기

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

	// 매개변수 개수를 모를때
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int... values1) { // 자바는 ...을 똑같은 배열타입으로 본다
		int sum2 = 0;
		for (int i = 0; i < values1.length; i++) {
			sum2 += values1[i];
		}
		return sum2;
	}

	// 메서드 안에 메서드를 사용하기
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2; // 14.0 /2
		return result;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}

	void println(String message) {
		System.out.println(message);
	}

	// 직사각형 너비 구하기 메서드오버로딩
	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}

}
