package chap01_;

public class _04for_while_lablefor_continue_stack_heap {

	public static void main(String[] args) {
		// for 문 밖에서의 i값은?
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i - 1) + " 합 : " + sum);
		// i가 100이 됐을때 실행문을 실행한후 i++를 한번더하고
		// 조건문을 보니까 101이라서 false가 돼서 for문을 나온다
		// 그래서 for문을 빠져나온 i는 101이다 @@@

		// for문에서 float을 쓰면 부동소수점 때문에 i++ 할때 값이 다르게 나와서
		// int를 쓰는게 좋다

		// 중첩 for문
		for (int j = 2; j < 10; j++) {
			System.out.println("*** " + j + "단 ***");
			for (int k = 1; k < 10; k++) {
				System.out.println(j + " x " + k + " = " + (j * k));
			}
		}

		// while문 1~ 100까지 숫자의 합 구하기
		int sum1 = 0;
		int m = 1;
		while (m < 101) {
			sum1 += m;
			m++;
		}
		System.out.println("1~" + (m - 1) + "의 총 합은 " + sum1);
		// 1~100의 총 합은 5050

		// do while 문
		sum1 = 0;
		m = 1;
		do {
			sum1 += m;
			m++;
		} while (m < 101);
		System.out.println("1~" + (m - 1) + "의 총 합은 " + sum1);
		// 1~100의 총 합은 5050

		// lable을 붙인 중첩 for문 /for문안에 char
		// 중첩된 두번째 for문안에서 break를 할때 lable을 써서
		// for문 전체를 빠져나올수있다
		outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break outter;
				}
			} // A-a A-b A-c A-d A-e A-f A-g
		}

		System.out.println("----");
		// 원래는 두번째 for문안에서 break를 쓰면 두번째 for문만 빠져나와
		// 첫번째 for문을 실행한다
		for (char upper1 = 'A'; upper1 <= 'Z'; upper1++) {
			if (upper1 == 'B') {
				break;
			}
			for (char lower1 = 'a'; lower1 <= 'z'; lower1++) {
				if (lower1 == 'd') {
					break;
				}
				System.out.println(upper1 + "--" + lower1);
				// if break문의 위치에 따라 d까지 출력될지 c까지 출력될지 다름
			} // A--a A--b A--c

		}

		// continue 를 만나면 첫째줄로 간다
		for (i = 1; i < 11; i++) {
			if (i % 2 != 0) { // 홀수면
				continue; // 바로 for문 첫째줄로간다 (아래실행문을 실행하지않음)
			}
			System.out.println(i); // 2 4 6 8 10
		}

		// 기본타입과 참조타입 스택과 힙영역
		int age = 100;
		String name = "홍길동";
		// 기본타입변수와 값은 스택영역에 그대로 저장된다
		// <스택영역> age = 100; name = 100 (100은 번지수)

		// 참조타입변수는 스택영역에 저장된다 번지수와 함께 저장
		// 값은 힙영역에 번지수를 가진 객체로 저장된다
		// <힙 영역> 100번지 "홍길동"
		// 스택영역의 변수가 힙영역의 번지수를 참조해서 참조타입

		// 참조타입 변수간의 == 는 두 변수가 참조하는 객체가 같은지 비교하는것

		// 참조타입 변수는 객체를 참조하지 않는다는 뜻으로 null값을 가질수 있다
		// null 로 초기화된 참조변수도 스택영역에 생성

		// String타입 참조 방식
		String name1 = "고길동";
		String name2 = "또치";
		// 문자열 내용이 다를때 고길동객체, 또치객체가 따로 만들어진다

		String name3 = "홍길동";
		String name4 = "홍길동";
		// 문자열 내용이 같을때 홍길동 객체 하나만 만들어져 name3, name4변수가
		// 같은 String 객체를 공유, 참조한다
		// name3==name4 true 같은객체참조

		// new연산자를 이용해 힙영역에 새로운 String객체를 생성할수있다
		// 객체 생성 연산자
		String name5 = new String("송은이");
		String name6 = new String("송은이");
		// 문자열 내용이같지만 new를 써서 다른 String객체를 만들었다
		// 둘은 번지수가 다르다
		// name5==name6 false 다른객체참조

		// 참조를 잃은 String 객체는 쓰레기수집기를 통해 메모리에서 자동 제거
		name6 = null; // 참조를 잃음 쓰레기수집기가 String객체를 제거함

		// 자바는 메모리영역을 메소드영역, 힙 영역, 스택영역으로 구분해서 사용
		// 메소드영역은 코드 저장, 힙은 객체저장, 스택은 변수와 기본타입값과 번지수저장

	}
}