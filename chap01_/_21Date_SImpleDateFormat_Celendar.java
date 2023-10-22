package chap01_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _21Date_SImpleDateFormat_Celendar {

	public static void main(String[] args) {
		// java.util 패키지
		// 는 날짜 정보를 제공하는 유용한 API를 포함하고있다

		// Date 클래스 : 날짜와 시간 정보를 저장하는 클래스
		// Date는 객체 간 날짜 정보를 주고받을때 매개변수나 리턴 타입으로 주로 사용
		// 디폴트가 영어라 한글로 된 날짜 형식을 얻기위해 java.text 패키지의
		// SimpleDateFormat 클래스와 함께 사용
		Date now = new Date();
		System.out.println(now); // Fri Oct 20 15:26:47 KST 2023
//		System.out.println(now.toString()); toString 생략가능

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// yyyy MM dd 대소문자 구분함
		String strNow = sdf.format(now);
		System.out.println(strNow);

		System.out.println("----");

		// Celendar : 운영체제의 날짜와 시간을 얻을때 사용
		// 추상클래스라 new로 객체를 못만듦
		// 대신 Calendar.getInstance() 로 하위객체를 얻을수있음
		Calendar cal = Calendar.getInstance();
		// .get메서드를 사용하고 Calender.상수로 년,월 날짜시간정보 가져옴
		int year = cal.get(Calendar.YEAR); // 2023
		int month = cal.get(Calendar.MONTH) + 1; // +1을 꼭해야함 / 10
		int day = cal.get(Calendar.DAY_OF_MONTH); // 20
		int week = cal.get(Calendar.DAY_OF_WEEK); // 6
		// 요일이 숫자로출력 switch나 if로 문자열을 출력하게 바꿔줘야함
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월요일";
			break;
		case Calendar.TUESDAY:
			strWeek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수요일";
			break;
		case Calendar.THURSDAY:
			strWeek = "목요일";
			break;
		case Calendar.FRIDAY:
			strWeek = "금요일";
			break;
		case Calendar.SATURDAY:
			strWeek = "토요일";
			break;

		case Calendar.SUNDAY:
			strWeek = "일요일";
			break;

		}

		// 오전 오후
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		switch (amPm) {
		case Calendar.AM:
			strAmPm = "오전";
			break;

		default:
			strAmPm = "오후";
			break;
		}

		// 시,분,초
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
//		System.out.println(week); 6 나와서 문자열로바꾸는과정필요
		System.out.println(strWeek);
		System.out.println(strAmPm); // 오후
		System.out.println(hour); // 4
		System.out.println(minute); // 20
		System.out.println(second); // 50

//		Date, Calendar 클래스는 문제가 많아 부분적으로 deprecated 되며 사용이 지양되고 있고,
//		Java 8 이후에 새롭게 만들어진 java.time 패키지 클래스 사용을 권장한다. -블로그
	}

}
