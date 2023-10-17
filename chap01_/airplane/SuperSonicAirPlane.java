package chap01_.airplane;

public class SuperSonicAirPlane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() { // ctra + space, 메서드이름으로 오버라이딩
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 합니다");
		} else {
			super.fly(); // 부모메서드 호출
		}

	}
}
