package chap01_;

public class _08 {

	public static void main(String[] args) {
		// 메서드 저장을 해야 컴파일이 돼서 메서드 사용 가능
		// 리턴값이 있을때 변수에 항상 저장
		Calculator cal = new Calculator();
		byte b = 10;
		byte b1 = 5;
		double dVal = cal.devide(b, b1);
		// byte는 int로 형변환이 자동으로 돼서 문제없음
		System.out.println(dVal); // 2.0

		// cal.devide(10.5,5,0);
		// 실수타입은 int보다 크기때문에 자동형변환이 안되서 에러

		// 메서드 매개변수 개수를 모를때
		// 메서드 생성할때 매개변수에 배열타입을 넣은후 메인에서 배열을 만들어
		// 메서드 인수에 씀
		int[] array = { 1, 2, 3 };
		int total1 = cal.sum1(array);
		System.out.println(total1); // 6

		int total2 = cal.sum1(new int[] { 2, 4 });
		System.out.println(total2); // 6

		// int sum2(int... values1) ...을 썼을때 배열을 인수값에 써도되고
		int total3 = cal.sum2(3, 4, 5); // 정수만 써도됨
		System.out.println(total3);

		int[] array2 = { 3, 4, 5 };
		int total4 = cal.sum2(array2);
		System.out.println(total3); // 12

		// 메서드 타입과 리턴 타입은 같아야하는데
		// byte에서 int는 자동형변환이 됨 이럴경우도 리턴값에 사용할수있음
//		int plus(int x,int y) {
//			byte result= (byte) (x+y);
//			return result;
//		}

		// void 선언된 메서드에서 return을 사용하면 메서드를 강제 종료
//		void run() {
//			while(true) {
//				if(gas>0) {
//					System.out.println("달립니다~. gas잔량: "+ gas);
//				}else {
//					System.out.println("멈춥니다.");
//					return;    
//				}  
//		 System.out.println("Hi");
//			}
//		}  void는 원래 리턴값이 없고 return을 만나면 메서드를 강제종료 시킨다
		// return자리에 break쓰면 while문을 빠져나가 아래 Hi를 실행함
		// retunr은 Hi를 실행하지않고 메서드를 바로 종료시킴

		Car gasCar = new Car();
		gasCar.setGas(5); // gas필드 설정
		boolean gasState = gasCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니당");
			gasCar.run();
		} else {
			System.out.println("깨스가 없숩니당");
			gasCar.run();
		}
		// 달리고나서
		if (gasCar.isLeftGas()) { // true면 gas가 남아있다는뜻
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하셔야합니다.");
		}

	}

}
