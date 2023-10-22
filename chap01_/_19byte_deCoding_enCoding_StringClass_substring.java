package chap01_;

import java.io.IOException;

public class _19byte_deCoding_enCoding_StringClass_substring {

	public static void main(String[] args) throws IOException {
		// String 클래스
		// String 생성자를 이용해 직접 String 객체를 생성할 수 있다
		// new String()은 byte를 문자열로 변환시킨다
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

//		String str3 = new String();  배열을 String객체로 생성
		String str3 = new String(bytes);
		System.out.println(str3); // Hello Java 출력

		// 배열의 인덱스위치부터 length만큼 String 객체로 생성
		String str4 = new String(bytes, 6, 4);
		System.out.println(str4); // Java 출력

		// 디코딩 - 알아듣는 문자로 번역하는것

		// 원래 숫자를 문자열로 바꾸면
		int ints = 101;
		String st = String.valueOf(ints);
		System.out.println(st); // "101"

		// 키코드와 String 객체를 이용해 byte배열을 문자열로 출력
//		byte[] bytes2 = new byte[100];
//		System.out.println("입력 :");
//		int readByteNo = System.in.read(bytes2);
		// 읽은 키코드를 bytes2 배열에 저장, int에 length저장

//		String str5 = new String(bytes2, 0, readByteNo - 2);
//		System.out.println(str5); // 인덱스위치부터 length만큼
		// -2는 엔터 키코드 빼기. 입력한 키코드만 출력
		// hello엔터를 했을때 hello 만 출력

		// 문자 추출 charAt()메서드
		// 인덱스의 문자를 리턴
		String subject = "자바 프로그래밍";
		char charVal = subject.charAt(3);
		System.out.println(charVal); // 프 출력

		// 문자열을 바이트로 바꾸는 것을 인코딩이라 함
		// getBytes() 바이트배열로 변환
		// 이클립스의 디폴트 문자셋으로 인코딩된 바이트 배열 리턴
		String str6 = "안녕하세요";
		byte[] byte1 = str6.getBytes();
		// 윈도우가 쓰는 문자셋이 MS949라 이클립스도 MS949가 디폴트이다 (general-workSpace맨아래에서확인가능)
		// ms949는 한글 한글자당 2바이트로 본다
		// 현재 쓰고있는 이클립스는 utf-8 이라 한글 한글자당 3바이트로 본다
		System.out.println(byte1.length); // 15 5글자*3바이트

		// 다시 디코딩
		String str7 = new String(byte1);
		System.out.println(str7); // 안녕하세요

		System.out.println("----");
		
		// getBytes(Charset charset) 은 특정 문자셋으로 인코딩된 바이트 배열 리턴
		byte[] byte2 = str6.getBytes("EUC-KR"); // EUC-KR은 한글 한글자당 2바이트
		System.out.println(byte2.length); // 10

		// 특정 문자셋으로 인코딩했으면 디코딩할때도 같은 문자셋을 인수값으로 씀 안그럼 한글 깨짐!@
		String str8 = new String(byte2, "EUC-KR");
		System.out.println(str8); // 안녕하세요

		byte[] byte3 = str6.getBytes("MS949"); // EUC-KR은 한글 한글자당 2바이트
		System.out.println(byte3.length); // 10

		String str9 = new String(byte3, "MS949");
		System.out.println(str9); // 안녕하세요

//		문자셋(Character set)
//		웹브라우저가 HTML문서를 정확하게 나타내기 위해서는 해당 문서가 어떠한 문자셋으로 저장되었는지를 알아야
//		한다.따라서 HTML문서가 저장될 때 사용된 문자셋에 대한 정보를 <head>태그 내의 <meta>태그에 명시한다.

		// 문자열 찾기 indexOf(), contains()
		// 매개값으로 주어진 문자열이 시작되는 인덱스 리턴
		// 주어진 문자열이 포함돼있지 않으면 -1 리턴
		String subject1 = "자바 프로그래밍";

		int location = subject1.indexOf("프로그래밍");
		System.out.println(location); // 3

		if (subject1.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}

		// .contains() 포함돼있는지 불리언값으로 알려줌
		boolean b = subject1.contains("C");
		System.out.println(b); // false

		if (subject1.contains("자바")) {
			System.out.println("자바책 입니다.");
		} else {
			System.out.println("자바책이 아닙니다.");
		}

		// .length() 길이를 알려줌
		String ssn = "0000001111111";

		if (ssn.length() == 13) {
			System.out.println("주민번호가 자리수가 맞습니다");
		} else {
			System.out.println("주민번호 자리수가 틀립니다");
		}

		// 문자열 바꾸기(대치) replace("자바","Java")
		// 첫번째 매개값인 문자열을 찾아 두번째 매개값인 문자열로 바꿔
		// 새로운 문자열 생성 및 리턴
		// String 타입은 문자열을 한번 저장하면 바꿀 수 없다 불변의 문자열이라고 함
		// 그래서 원본 문자열을 바꿀수 없으니 새로운 문자열을 생성하고 힙영역에 저장한다

		String oldStr = "자바는 객체 지향 언어입니다.";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr); // Java는 객체 지향 언어입니다.

		// 문자열 잘라내기 substring()
		// substring(int beginIndex, int endIndex) 인덱스로 시작과 끝의 직전 문자열 추출
		// substring(int beginIndex) 인수값의 인덱스 시작부터 끝까지 문자열 추출

		String ssn1 = "000000-1234567";

		String firstNum = ssn1.substring(0, 6); // 0부터 6직전 인덱스 추출
		String secondNum = ssn1.substring(7);

		System.out.println(firstNum); // 000000
		System.out.println(secondNum); // 1234567

		// 알파벳 대,소문자로 변경 toLowerCase(), toUpperCase()
		// 역시 String타입이라 원본을 바꾸지않음

		String s1 = "Java Programming";
		String s2 = "JAVA Programming";

		System.out.println(s1.equals(s2)); // 대소문자를 구분하기때문에 false
		// 대소문자상관없이 내용이 같은지를 확인하려면 둘다 소문자로 변경하든 대문자로 변경해서
		// 비교하면된다

		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();

		System.out.println(s3.equals(s4)); // true

		// 문자열 앞뒤 공백 잘라내기 .trim()
		String tel1 = "  02";
		String tel2 = " 123 ";
		String tel3 = " 1234  ";
		String tel4 = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel4);

		// 기본타입의 값을 문자열로 변환 valueOf()
		String st1 = String.valueOf(10);
		String st2 = String.valueOf(10.5);
		String st3 = String.valueOf(true);

		System.out.println(st1); // "10"
		System.out.println(st2); // "10.5"
		System.out.println(st3); // "true"

	}

}
