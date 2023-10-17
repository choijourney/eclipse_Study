package chap01_;

public class _06 {

	public static void main(String[] args) {
		// 메인메서드의 String[] args 에대해..

		if (args.length < 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 프로그램종료를 안시키면 예외뜸
		}

		// System.exit(0) 프로그램을 종료한다
		// 0 은 정상종료를 의미

		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);
		int total = num + num1;
		System.out.println(total);
		// run configurations 에 들어가서 arguments에
		// 요소들을 입력한 후 실행하면 total 값 나옴

		// 명령프롬프트에서도 args를 입력해서 total값을 출력할수있다
		// 혼공자 23강- 자바배열(2) 에 나옴

		// 배열 : 같은 타임의 데이터를 연속된 공간에 나열하고,
		// 각 데이터에 인덱스를 부여한 자료구조

		System.out.println("----");
		// 다차원 배열 배열안에 길이가 다른 배열을 넣을수있다
		int[][] number = { { 1, 2 }, { 3, 4, 5 } };

		int[][] number1 = new int[2][];
		number1[0] = new int[2];
		number1[1] = new int[3];
		number1[0][0] = 2;
		number1[0][1] = 4;
		for (int i = 0; i < number1.length; i++) {
			for (int j = 0; j < number1[i].length; j++) {
				System.out.println(number1[i][j]);
			}
		}

		// 중첩배열로 영화관 좌석 만들기
		String[][] seat = new String[10][15];
		for (int i = 0; i < seat.length; i++) {
			char al = 'A';
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = String.valueOf(al) + (j + 1);
			} // char를 String으로 바꿀때가 중요
			al++; // char먼저 String으로 바꿔야 뒤에 숫자를 더해도
		} // char가 int로 변하지않고 문자열로 된다

		// 영화관 좌석 출력
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		// for each로 출력
		for (String[] st : seat) {
			for (String s : st) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

		// 참조타입 배열은 String과 똑같이 스택영역에 변수와 번지수를 저장하고
		// 힙영역에서 객체를 참조한다.
		String[] strArray = new String[3];
		strArray[0] = "java"; // 인덱스 0과 1은 같은 객체를 참조함
		strArray[1] = "java";
		strArray[2] = new String("java");

		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false

		// 배열 복사 System.arraycopy()
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// (원본배열, 어디서부터 복사할건지 인덱스, 새배열,인덱스, 몇개복사할건지개수)
		// oldStrArray의 번지수를 복사해서 newStrArray객체를 만든다
		// java array copy null null 출력

		// for문을 이용해 요소 하나하나를 복사하는 방법도있음
		int[] ar = { 1, 2, 3 };
		int[] ar1 = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar1[i] = ar[i];
		}
		// 복사한 배열 값 확인
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]); // 1 2 3 0 0
		}

		// 열거 타입 열거 상수: 변하지않는값을 저장하는 타입(날짜,요일 같은 )
		// 열거타입 선언-> 소스파일생성 - public enum 열거이름 {..}
		// 열거이름 첫글자는 대문자 Week 열거 상수는 모두 대문자로 작성
		// 열거 상수는 열거 객체를 힙영역에 저장. SUNDAY 같은 내용(코드)를
		// 메소드 영역에 저장. 변수 이름을 스택영역에 저장함
		// 참조타입이다

		// Week.java 에 열거 타입 만듦
		Week today = Week.SATURDAY; // 열거타입 변수 today에 열거상수 저장

	}

}
