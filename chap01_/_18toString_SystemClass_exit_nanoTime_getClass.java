package chap01_;

import java.util.Date;

import chap01_.smartphone.SmartPhone;

public class _18toString_SystemClass_exit_nanoTime_getClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// Object 클래스의 메서드들 이어서..

		// toString()메서드 객체의 문자정보를 줌
		// 기본적으로 클래스이름@16진수해시코드 로 구성된 문자정보를
		// 주는데 오버라이딩해서 문자열같은 유용한 내용으로 바꿀수있다

		Object obj1 = new Object();

		Date obj2 = new Date();

		System.out.println(obj1.toString());// java.lang.Object@2133c8f8
		System.out.println(obj2); // Thu Oct 19 19:57:46 KST 2023
		// toString을 생략해도, 자동으로 toString을 호출해서 출력함
		// Date 클래스(내장클래스)에서 toString을 재정의해서 날짜를 출력함

		

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

		String strobj = myPhone.toString();
		System.out.println(strobj);
		// chap01_.smartphone.SmartPhone@2344fc66 둘다 같은결과
		System.out.println(myPhone);

		// toString메서드 재정의하고나선
		// return company + " , " + os;
		// 구글, 안드로이드 출력

		// 클래스에서 toString을 재정의해서 의미있는 문자열을 만들수있음

		System.out.println("----");

		// System 클래스
		// 의 모든 필드와 메소드는 static으로 구성

		// 프로그램 종료 exit(int) : JVM(자바가상기계)을 강제종료
		// exit()메소드가 지정하는 int매개값을 종료상태값이라 함
		// 예를들어 0은 정상종료

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
//				System.exit(0); // 프로그램종료돼서 아래코드실행 안됨
				break; // for문을 빠져나가 마무리코드 출력
			}
		}
		System.out.println("마무리 코드");

		// 현재 시각 읽기 currentTimeMillis(), nanoTime()
		// currentTimeMillis() : 1/10의3승 long값 리턴
		// nanoTime() : 1/10의9승 long값 리턴

		long time1 = System.nanoTime();

		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}

		long time2 = System.nanoTime();
		System.out.println("1~1000000 까지의 합은 " + sum);
		System.out.println("더하는데 걸린 시간은 " + (time2 - time1) + " 나노초");
		// 7748400 나노초 = 0.0077초

		System.out.println("----");
 
		// Class 클래스
		// 자바는 클래스와 인터페이스의 메타데이터를 Class클래스로 관리
		// 메타데이터 : 데이터를 설명하는 데이터
		// -타입이름,파일경로,필드정보,생성자정보,메소드정보

		// class객체 얻기
		// 첫번째 방법 Class c1 = 클래스이름.class
		Class c1 = SmartPhone.class;

		// 두번째 방법 Class c2 = Class.forName("전체이름")
		Class c2 = Class.forName("chap01_.smartphone.SmartPhone");

		// 세번째 방법 Class c3 = 참조변수.getClass();
		SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");
		Class c3 = smartPhone.getClass();

		System.out.println(c1 == c2); // true
		System.out.println(c1 == c3); // true
		// c1,c2,c3은 모두 같은객체를 참조한다

		System.out.println(c1.getName());
		// 전체이름 출력 chap01_.smartphone.SmartPhone
		System.out.println(c1.getSimpleName());
		// 클래스이름만 출력
		System.out.println(c1.getPackageName());
		// 패키지이름만 chap01_.smartphone
		System.out.println(c1.getPackage().getName());
		// 패키지이름만 chap01_.smartphone

		// 필드정보,메서드정보,생성자 정보등도 class객체를 얻어서 이용할수있다
		// API doc에서보면 getFields(),getMethods(),getConstructors()

		Class c4 = _18toString_SystemClass_exit_nanoTime_getClass.class;
		// 현재클래스 객체를 얻음. 현재클래스객체를 기준으로 위치를 얻을거다.
		String photo1Path = c4.getResource("photo1.jpg").getPath();
		// getResource로 url객체를 얻고 getPath로 전체경로를 얻는다

		String photo2Path = c4.getResource("smartphone/images/photo2.jpg").getPath();

		System.out.println(photo1Path);
		// / C:/studyJava/chap01/bin/chap01_/photo1.jpg
		System.out.println(photo2Path);
		// /C:/studyJava/chap01/bin/chap01_/smartphone/images/photo2.jpg
	}

}
