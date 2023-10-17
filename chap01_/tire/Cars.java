package chap01_.tire;

public class Cars {
	// field
	public Tires frontLeftTire = new Tires("앞왼쪽", 6);
	public Tires frontRightTire = new Tires("앞오른쪽", 2);
	public Tires backLeftTire = new Tires("뒤왼쪽", 3);
	public Tires backRightTire = new Tires("뒤오른쪽", 4);

	// constructor

	// method
	public int run() {
		System.out.println("자동차가 달립니다");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		;
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		;
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		;
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		;
		return 0;
	}

	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
