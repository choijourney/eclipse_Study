package chap01_.tire;

public class Tires {
	// field
	public int maxRotation; // 최대회전수
	public int accumulatedRotation; // 누적회전수
	public String location;

	// 생성자
	public Tires(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " tire수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println(location + " tire 펑크 **");
			return false;
		}
	}

}
