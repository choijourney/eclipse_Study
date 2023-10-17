package chap01_.animal;

public abstract class Animal {

	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상메서드
	public abstract void sound();
}
