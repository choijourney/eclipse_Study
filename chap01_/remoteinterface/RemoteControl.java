package chap01_.remoteinterface;

public interface RemoteControl {
	// 인터페이스는 상수와 추상메소드만 사용

	// 상수 앞에 public static final 숨겨져있음
	int MAX_VOLUME = 50; // 초기값 필수
	int MIN_VOLUME = 10;

	// 추상메소드를 쓰고 앞에 (public static void) 가 숨겨져있음
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}
