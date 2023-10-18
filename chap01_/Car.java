package chap01_;

public class Car { // _07 에서 참조
// field
	String company = "현대자동차";
	String model = "아반떼";
	String color = "그레이";
	int maxSpeed = 300;
	int speed; // 초기값 설정 안하면 기본값 0설정
	int gas;

	public Car(String color, int cc) { // 생성자에 외부값을 이용할수있음
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
	}

	public Car() {
		this("마젠타"); // 인수개수가 같은 Car를 가져와서 사용함
	}

	Car(String color) {
		this("현대자동차", color);
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = 300;
	}

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true; // gas가 0 이아니면 true출력
	}

	void run() {
		while (true) { // gas가 있는동안 달림
			if (gas > 0) {
				System.out.println("달립니다.gas잔량 : " + gas);
				gas--;
			} else {
				System.out.println("멈춥니다.gas잔량 : " + gas);
				return; // gas가없어서 차가멈춤 메서드 종료
			}
		}
	}

	int getSpeed() {
		return speed;
	}

	void carTurnOn() {
		System.out.println("시동을 겁니다");
	}

	// this를 안써도 상관없지만 인스턴스필드임을 강조하기위해 씀
	void carRun() {
		for (int i = 0; i <= 50; i += 10) {
			this.speed = i;
			System.out.println("달립니다 시속 : " + this.speed + "km");
		}
	}

	byte byteField; // 초기값 기본타입 0, 참조타입 null
	char charField;
	short shortField;
	int intField;
	long longField;
	float floatField;
	double doubleField;
	boolean booleanField;
	String stringField;
	int[] intArrField;
}
