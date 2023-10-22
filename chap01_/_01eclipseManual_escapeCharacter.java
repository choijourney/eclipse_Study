package chap01_;

public class _01eclipseManual_escapeCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		  qwertyuioplkjhgfdsazxcvbnm
//		  
//		  이클립스 뷰 : 이클립스 내부에서 사용되는 작은 창들 퍼스펙티브 : 프로젝트를 개발할때 유용하게 
//		  사용할수있는 뷰들을 묶어 명칭.  처음디폴트는 javaee 인데 (개발자용) 입문자용으로 java를 쓰면됨
//		  
//		  이클립스 매뉴얼 window - show view - console등 여러 뷰들있음 
//		  window - preference - general- appearence - 창색깔바꿈
//		   General > Editors > Text Editors > Spelling > Enable spee
//		  checking 해제 하면 맞춤법검사 안함
//		  
//		  bin폴더 : 소스파일을 작성후 저장하면 javac.exe로 컴파일을 직접하지 않고도 자동으로 
//		  바이트코드로 변환후 bin에 저장된다
//		  
//		  혼공자 자바 강의6강- 수동 컴파일. 따라했는데 실패
//		  
//		  모듈이란 외부에서 재사용할수있는 패키지들을 묶은것 이클립스의 프로젝트는 하나의 모듈을 
//		  개발하는것 A모듈 B모듈 C모듈 이모여 하나의 프로그램 탄생
//		  
//		  모듈 기술자 (module-info.java) 해당 모듈의 이름이 뭔지, 해당 모듈이 의존하는 모듈이 뭔지,
//		  해당 모듈을 외부에서 어떻게 사용할수있는지.
//		 
//		  의존하는모듈 : 해당 모듈(프로젝트)을 실행하기 위해서 필요한 외부 모듈 예를 들어 
//		  chap01모듈(프로젝트) 에는 java.base모듈이 필요하다
//		   java.lang , java.math , jave.util 등 이 베이트모듈이다 이런 java.base모듈은 
//		   디폴트로 내장돼있어서 따로 불러올 필요없지만 java.desktop모듈이나 java.sql모듈 등
//		   다른모듈들을 쓰려면 requires로
//		  불러와야한다. 이때 불러오는 모듈을 의존하는모듈이라 부른다 불러올 모듈이 많으면 하나하나 
//		  불러오지않고 최상위 모듈인 java.se 모듈을
//		  requires 하면 된다.
//

		// 변수 : 값을 저장할수 있는 메모리 번지에 붙인 이름.
		// 변수 선언 : 변수에 어떤 타입의 데이터를 저장할지, 변수 이름이 무엇인지를 결정하는 것

		// 변수 이름 명명 규칙
		// 첫번째 글자는 $ _ 로 시작할수있다.
		int $x = 1;
		int _x = 1;
		System.out.println($x + _x + "시간");
		// new, byte, char, extends, do 등 예약어는 쓸 수 없다.

		// int와 문자열이 더해지면 int가 문자열로 변해서 문자열로 출력된다
		// 위 예제에선 2시간 으로 잘출력이되는데 인텔리제이에서 11시간으로 출력된적이있다
		// 그럴때 숫자로 남겨놓고싶으면 ($x+_x)+"시간" 이렇게 괄호로 감싸주면된다.
		int t = $x + _x; // 아니면 더하기 변수를 하나더만들어서
		System.out.println(t + "시간");
		// 이렇게 했더니 잘 작동했다.

		int x = 3;
		int y = 5;
		int temp = 3;
		x = y; // 5
		y = temp; // 3 x와 y 값 서로교환

		// 변수 사용 범위: 메서드 내에서 선언된 변수를 로컬 변수라고한다. 메인메서드 내에서
		// 선언된 변수는 중괄호 안에서만 쓸 수 있고 중괄호 밖에서는 쓸 수 없다.
		// 메인메서드 뿐아니라 모든 메서드, 모든 중괄호 역시 그렇다

		// 변수가 어떤 범위에서 사용될 것인지 고려해서 선언 위치를 결정!

		// 리터럴 : 소스 코드에서 프로그래머에 의해 직접 입력된 값
		int k = 4; // 4가 리터럴

		// 정수 타입
		// byte - short - char - int -long 순으로 값의 혀용범위 커짐
		// byte : -128 ~ 127 까지 쓸 수있음
		// short : -32768 ~ 32767 까지 씀
		long var1 = 20000000000L; // 대문자 L이 잘보임

		// char 타입 작은따옴표로 감싸서 하나의 문자를 저장함
		char c = '각'; // 아스키코드:44033
		// 아스키코드 (숫자) 로 바꿀 수 있어서 char 타입도 정수타입이다.

		// char에 저장하는 'A' 문자와 String에 저장하는 "A" 문자열은 다르다
		// 작은따옴표의 한글자는 문자, "" 큰따옴표안에 들어가는게 문자열

		// 이스케이프 문자
		String str = "나는 \"자바\"를 좋아합니다"; // 나는 "자바"를 좋아합니다
		String str2 = "번호 \t이름\t나이"; // 번호 이름 나이
		System.out.println(str);
		System.out.println(str2);

		// \t 탭만큼 띄움 \" 큰따옴표출력 \' 작은따옴표출력 \\ \출력

		System.out.println("봄 \\ 여름 \\ 가을 \\ 겨울"); // 역슬래시 하나만 쓰면 오류
		// \하나만쓰면 이스케이프문자를 완성하지않은게 돼서 \\ 두개써야함

		// 타입 변환
		// 값의 허용범위가 작은 타입이 큰 타입으로 저장되면 자동타입변환
		byte b = 1;
		int i = b; // byte가 작으니까 int로 변환할때 자동형변환.

		int n = 3;
		double d2 = n;
		System.out.println(d2);

		// char 타입 변환에서 컴파일 에러
		int i2 = 1;
		char c2 = (char) i2; // 여기서 오류표시가 없어도 컴파일 에러남
		System.out.println(c2); // char는 0~65000까지값이라서
		// 음수가 허용되는 int , byte,Double 같은 타입은 char로 변환할수없다!

		// 반대로 char는 다른 정수 타입으로 변환 가능하다
		char c3 = '한';
		int i3 = c3;
		System.out.println(i3); // 54620 아스키코드

		// 강제 타입 변환 Casting
		// 큰 허용범위 타입을 작은 허용범위 타입으로 강제로 나누어 한조각만 저장

		// 캐스팅 연산자 괄호() 사용. 괄호안이 나누는 단위
		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);

		// int타입을 char타입으로 강제변환
		int intvalue2 = 65;
		char ch = (char) intvalue2;
		System.out.println(ch); // A 출력

		// 실수타입을 정수 타입으로 강제변환
		double d4 = 3.0;
		int intvalue3 = (int) d4;
		System.out.println(intvalue3); // 3 출력

		// String을 int로 변환할땐 (int) 가 안먹힌다
		String s = "4";
		int n2 = Integer.valueOf(s); // 4 로 변환
		System.out.println(n2);
		int nn = Integer.parseInt(s);
		System.out.println(nn); // 4로 변환

		String ss = String.valueOf(nn); // "4" 로 변환

		// 정수 연산에서 자동 타입변환
		byte x1 = 10;
		byte y2 = 30;
//		byte sum = x1+y2;  타입 오류 	
		int sum1 = x1 + y2;
		// byte,char,short 정수타입변수가 연산을 하면 int타입으로 자동변환

		// 연산값중 하나가 long타입이면 다른 연산자도 long타입으로 변환
		int o = 1;
		long lo = 1L;
		long sum2 = o + lo;

		// 일반 덧셈을 byte변수에 저장하는건 된다
		byte result = 10 + 30;

		// byte + int + long = long타입
		byte v1 = 10;
		int v2 = 20;
		long v3 = 1000;
		long result1 = v1 + v2 + v3;

		// double과 더하기하면 다른 피연산자도 double타입으로 자동변환
		int intV = 10;
		double doubleV = 5.5;
		double result2 = intV + doubleV; // 15.5

		// int와 double 더한값을 int로 저장하고싶으면 double을 int로 강제변환시킴
		int intV2 = 10;
		double doubleV2 = 5.5;
		int result3 = intV2 + (int) doubleV2; // 5.5가 5가되어 15

		// 자바는 실수 연산을 double로 본다 double에 저장해야함
//		float fV= 1.5+2.3; 오류남
		double dV = 1.5 + 2.3;
		float fV2 = 1.5f + 2.3f; // float에 저장하려면 형변환을 해야함

		// 정수 연산의 결과를 실수로 저장할 때 주의점
		int xx = 1;
		int yy = 2;
		double result4 = xx / yy;
		// 정수 연산은 값이 정수로 나옴 그래서 0.5에서 .5를 떼고 0을 출력함
		// 이 값을 double에 저장하면 0.0이됨

		// 실수 결과를 얻으려면 실수로 변환
		int xx1 = 1;
		int yy1 = 2;
		double result5 = xx / (double) yy; // 0.5
		// 둘다 double로 바꿔도되고 둘중 하나만 바꿔도됨

		// char는 정수타입이라 char끼리 더하면 int타입으로 자동변환
		char charV = 'A';
		char charV2 = 1;
		int result6 = charV + charV2; // 66
		char charV3 = (char) result6; // B
		// char로 저장하려면 강제변환

		int iV = 10;
		int iV1 = iV / 4; // 2
		double dV3 = iV / 4.0; // 2.5

	}

}
