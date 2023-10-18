package chap01_.tireinterface;

public class Car1 {
	public Tire1 frontLeftTire = new HankookTire1();
	public Tire1 frontRightTire = new HankookTire1();
	public Tire1 backLeftTire = new HankookTire1();
	public Tire1 backRightTire = new HankookTire1();

	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
