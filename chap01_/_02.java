package chap01_;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) throws Exception {
		// + 연산 에서 문자열 자동 타입변환
		// 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동변환
		int val = 3 + 7; // 10
		String str = "3" + 7; // 7이 문자열로 변환되어 "37" 이됨

		// + 연산은 앞에서부터 순차적으로 계산. ()중괄호가있으면 중괄호부터 계산
		int val1 = 1 + 2 + 3; // 6
		String str1 = 1 + 2 + "3"; // 3+"3" 에서 3이 문자열로되고 "33"
		String str2 = 1 + "2" + 3; // "12"+3 에서 3이 문자열로되고 "123"
		String str3 = "1" + 2 + 3; // "12"+3 -> "123"
		String str4 = "1" + (2 + 3); // 15

		// 문자열을 기본타입으로 강제변환
		String st = "10";
		byte bV = Byte.parseByte(st);
		String st1 = "11";
		short sh = Short.parseShort(st1);
		String st2 = "12";
		int iV = Integer.parseInt(st2);
		String st3 = "13.0";
		float fV = Float.parseFloat(st3);
		String st4 = "14.0";
		double dV = Double.parseDouble(st4);
		// 문자열을 boolean 으로 형변환
		String st5 = "true";
		boolean bo = Boolean.parseBoolean(st5);

		// 문자열에 숫자 말고 문자를 포함할경우 NumberFormatException 예외발생

		// String.valueOf(3); 기본타입을 문자열로 변환
		String.valueOf(3); // "3"
		String st6 = "" + 3; // "3" 큰따옴표를 더해도 문자열로됨

		// printf
		System.out.printf("이름 : %1$s, 나이 : %2$d \n", "김자바", 25);
		// 이름 : 김자바, 나이 : 25 1$ : 첫번째값 s: String
		// 1$ 따로 순서를 안적으면 "김자바", 25 순서대로 값이 대입돼서 출력

		System.out.printf("%-6d \n", 333); // 333___ 왼쪽정렬
		// % 를 출력하고싶으면 %% 두개씀

		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value); // 123원
		System.out.printf("상품의 가격: %6d원\n", value); // ___123원
		System.out.printf("상품의 가격: %-6d원\n", value); // 123___원
		System.out.printf("상품의 가격: %06d원\n", value); // 000123원

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f \n", 10, area);
		// 실수는 .2f 를 써야함 .3f 소수점셋째자리 .4f 소수점넷째자리까지 출력

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | $10s \n", 1, name, job);

		// 키코드 : 키보드에서 키를 입력할때 프로그램에서 숫자로 된 키코드를 읽음
		// 키보드에서 입력된 내용을 변수에 저장
		// System.in.read() 사용
		// 얻은 키코드는 int변수에 저장

		int keyCode;
		keyCode = System.in.read(); // throws 예외처리 해줘야함
		System.out.println("keyCode : " + keyCode); // A입력
		// 이렇게 쓰면 콘솔에 입력을 할때까지 빨간네모버튼 중지버튼이 켜있다.
		// A 입력하면 int로 변환되어 keyCode : 65 출력
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // 엔터키코드 13
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // 엔터키코드 10
		// 첫번째 A keyCode를 읽은후 엔터키 코드까지 출력함

		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if (keyCode == 113) { // q의 키코드가 113임
				break; // q를 누르면 break
			}
		}

		// .read() 메서드 쓸땐 throws Exception 예외처리 해줘야함
		// System.in.read()의 단점 : 키코드를 읽는거라 한 글자만 읽을 수 있음
		// 통문자열을 읽을 수 없음. 그래서
		// Scanner로 해결 통문자열도 읽을수있음

		Scanner sc = new Scanner(System.in); // Scanner쓸때 import
		String inputData;

		while (true) {
			inputData = sc.next();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}

	}

}
