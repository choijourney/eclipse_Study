package chap01_;

import java.util.Random;

public class _03TernaryOperator_randomNumber_switch_break {

	public static void main(String[] args) {
		// 연산자 : 연산에 사용되는 표시나 기호 + -
		// 피연산자 : 연산자와 함께 연산되는 데이터
		// 연산식 : 연산자와 피연산자를 사용하여 연산 과정을 기술한것

		// 부호 연산자 기본타입 앞에 사용 (불리언,char 제외)
		int x = -100;
		int result = +x; // -100
		int result1 = -x; // 100

		byte b = 100;
//		byte result2 = -b;  오류남
		int result2 = -b; // int미만 정수 연산은 int로 타입이 바뀐다

		System.out.println("----");
		// 단항 연산자 ++i
		// i++; ++i; 두개는 값이 같음
		// 대입연산자와 같이 쓰면 ++위치에따라 값이 달라짐
		x = 10;
		int y = 10;
		int z;
		x++;
		System.out.println(x); // 11
		++x;
		System.out.println(x); // 12

		z = x++;
		System.out.println(z); // 12
		System.out.println(x); // 13

		z = ++x;
		System.out.println(z); // 14
		System.out.println(x); // 14

		z = ++x + y++; // z= 15 + 10 ;
		System.out.println(x); // 15
		System.out.println(z); // 25
		System.out.println(y); // 11

		// !논리부정연산자 반대로값을바꿈 boolean타입에만 가능
		boolean play = true;
		play = !play;
		System.out.println(play); // false
		play = !play;
		System.out.println(play); // true
		// 토글 가능

		// 논리연산자중 ()&&() 두개면 앞에 식이 false면 다음식을 보지않고 false
		// & 하나면 앞 식이 false여도 다음식까지 확인

		System.out.println("----");
		// 비교 연산자
		int iV = 1;
		double dV = 1.0;
		System.out.println(iV == dV); // true

		// double과 float을 비교할때 주의점
		double dV1 = 0.1;
		float fV = 0.1f;
		System.out.println(dV1 == fV); // false
		// 0.1 == 0.1 이 false인 이유는 두값을 비교할때 float을 double로
		// 변환하는데 변환할때 값이 부동소수점나오는 값으로 바뀐다
		System.out.println((double) fV); // 0.10000000149011612

		// double과 float의 값을 비교하지 않는게 좋고 혹시 비교하려면
		System.out.println((float) dV1 == fV); // true
		// double타입을 float으로 변환한뒤 비교하면된다

		// 아니면 둘다 int로 변환한뒤 비교해도된다
		System.out.println(((int) (dV1) == (int) (fV))); // true

		// 삼항 연산자안에 삼항연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급 입니다.");

		// switch break 일부러 안쓰는경우
		Random random = new Random();
		int time = (random.nextInt(4) + 8); // 8~ 11 까지 정수
		int time1 = (int) (Math.random() * 4) + 8; // 8~ 11 까지 정수

		switch (time) {
		case 8:
			System.out.println("출근합니다");

		case 9:
			System.out.println("회의를 합니다");

		case 10:
			System.out.println("업무를 봅니다");

		default:
			System.out.println("외근을 나갑니다");

		}

		// switch 예제
		char grade1 = 'B';
		switch (grade1) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다");
			break;
		default:
			System.out.println("손님입니다");
			break;
		}

		// switch 문자열 예제
		String position = "과장";
		switch (position) {
		case "부장":
			System.out.println("700만원");

			break;

		default:
			System.out.println("500만원");
			break;
		}

	}

}
