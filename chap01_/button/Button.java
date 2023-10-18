package chap01_.button;

public class Button {
	OnClickListener listener;

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void click() { // 메인에서 실행할때 click메서드 하나로
		listener.onClick(); // 구현객체의 onClick을 쓸수있게 만듦
	}

	public static interface OnClickListener { // 중첩인터페이스
		void onClick(); // 추상메소드
	}
}
