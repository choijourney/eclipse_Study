package chap01_.tire;

public class HankookTire extends Tires {
	// field

	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모생성자 호출
	}

	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println(location + " HankookTire 펑크 **");
			return false;
		}
	}
}
