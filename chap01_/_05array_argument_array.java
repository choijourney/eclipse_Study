package chap01_;

import java.util.Arrays;

public class _05array_argument_array {

	public static void main(String[] args) {
		// 배열 생성
		int[] arra = { 1, 2, 3 };
		// 배열을 선언할때 객체를 생성하면 문제없음

		int[] arr;
//		arr= {1,2,3}; 오류남
		arr = new int[] { 1, 2, 3 }; // 선언후 나중에 값을 채울때는 new를 써야함
		System.out.println(Arrays.toString(arr));

		// 배열의 평균값 구하기
		int sum = 0;
		int[] score = { 83, 90, 87 };
		for (int i = 0; i < 3; i++) {
			sum += score[i];
		}
		double d = (double) sum / 3;
		System.out.println("score 평균 값" + d);

		// 보통은 배열을 선언할때 바로 객체를 생성한다
		int[] arr1 = { 1, 2 }; // ← 이렇게

		System.out.println("----");
		// 가끔 배열을 먼저 선언한 후 나중에 객체를 만들어야 할때가있다(메서드만들때)
		double result = addArr(new int[] { 80, 90, 85 });
		System.out.println(result);
		// 메서드 괄호안 인수에 배열을 먼저 선언하고
		// 메서드를 사용할때 인수안에 객체를 생성함

		// new 연산자로 배열 생성
		int[] scores3 = new int[10];
		// 메모리에 0~9까지 인덱스자리에 0000000000 으로 초기화됨
		String[] names = new String[3];
		// 메모리에 0~2까지 인덱스자리에 null null null 으로 초기화됨
		names[0] = "송중기";
		// 배열 생성후 인덱스 위치에 새 값 저장

		// 배열 길이 메서드 .length
		int num = names.length; // 3

		// length 를 이용해 평균값 구하기
		int[] scores4 = { 90, 80, 70 };
		int total = 0;
		for (int i = 0; i < scores4.length; i++) {
			total += scores4[i];
		}
		System.out.println("평균은 " + total / scores4.length);

	}

	public static double addArr(int[] score2) { // 배열 선언을 인수안에서
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += score2[i];
		}
		double d = (double) sum / 3;
		return d;
	}

}
