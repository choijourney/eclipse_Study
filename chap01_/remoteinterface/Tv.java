package chap01_.remoteinterface;

public class Tv implements RemoteControl {
	// 인터페이스 구현
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	// 인터페이스 상수를 사용할때는 인터페이스이름.상수 로쓰면됨
	// RemoteControl.MAX_VOLUME
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + this.volume);

	}
}
