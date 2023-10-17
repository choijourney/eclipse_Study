package chap01_.phone;

public class DmbPhone extends CellPhone { // 상속받음
	// field
	int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	// 생성자 super안적어도 컴파일러가 자동생성해줌
	public DmbPhone(String model, String color, int channel) {
		super(model, color); // CellPhone생성자 불러옴.
		this.channel = channel;
	}

	// 메서드
	public void turnOnDmb() {
		System.out.println("채널 + " + channel + "번 DMB 방송 수신 시작");
	}

	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿈");
	}

	public void turnOffDmb() {
		System.out.println("방송 수신 스탑");
	}
}
