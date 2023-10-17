package chap01_.phone;

public class CellPhone {
	// field
	public String model;
	String color;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 생성자 생략해도 컴파일할때 기본생성자 생성
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("CellPhone생성자 호출됨");
	}

	// 메서드
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다");
	}

	public void bell() {
		System.out.println("벨이 울립니다~");
	}

	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

}
