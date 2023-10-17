package chap01_.makecar.hankook;

public class Tire {
	// filed
	public String name = "한국";

	private int speed; // private으로 필드를 만든뒤 게터세터 사용
	private boolean stop;

	// mathod

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
		this.speed = speed;
	}

	public boolean isStop() { // 불리언타입의 getter는 is 로시작한다
		return stop;
	}

	public void setStop(boolean stop) {
		if (stop) {
			speed = 0;
		}
		this.stop = stop;
	}
}
