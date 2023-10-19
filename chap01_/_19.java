package chap01_;

import java.io.IOException;

public class _19 {

	public static void main(String[] args) throws IOException {
		// String 클래스
		// String 생성자 직접 String 객체를 생성
		// new String()은 byte를 문자열로 변환시킨다
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

//		String str3 = new String();  배열을 String객체로 생성
		String str3 = new String(bytes);
		System.out.println(str3); // Hello Java 출력

		// 배열의 인덱스위치부터 length만큼 String 객체로 생성
		String str4 = new String(bytes, 6, 4);
		System.out.println(str4); // Java 출력

		// 디코딩 - 알아듣는 문자로 번역하는것

		// 지정한 문자셋으로 디코딩 모르겠음
		// String str = new String(byte[] bytes1, String charSetName);

		// 원래 숫자를 문자열로 바꾸면
		int ints = 101;
		String st = String.valueOf(ints);
		System.out.println(st); // "101"

		// 키코드와 String 객체를 이용해 byte배열을 문자열로 출력
		byte[] bytes2 = new byte[100];
		System.out.println("입력 :");
		int readByteNo = System.in.read(bytes2);
		// 읽은 키코드를 bytes2 배열에 저장, int에 length저장

		String str5 = new String(bytes2, 0, readByteNo - 2);
		System.out.println(str5); // 인덱스위치부터 length만큼
		// -2는 엔터 키코드 빼기 입력한 키코드만 출력
		// hello엔터 를 했을때 hello 만 출력

		// 문자 추출 charAt()메서드
		// 인덱스의 문자를 리턴
		String subject = "자바 프로그래밍";
		char charVal = subject.charAt(3);
		System.out.println(charVal); // 프 출력

	}

}
