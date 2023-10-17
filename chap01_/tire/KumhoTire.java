package chap01_.tire;

public class KumhoTire extends Tires {
	// field

	// constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// method
	@Override
	public boolean roll() {
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println(location + " KumhoTire 펑크 **");
			return false;
		}
	}
}
