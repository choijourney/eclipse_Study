package chap01_;

public class test {

	public static void main(String[] args) { // 연습장
		int[] arr = { 3, 4, 5 };
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);

		System.out.println("----");

		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println(sum);

		System.out.println("----");

		plus(5, 5);

	}

	static void plus(int... value0) { // 따로 배열만들필요가없음
		int total0 = 0;
		for (int i : value0) {
			total0 += i;
		}
		System.out.println(total0);
	}

}
