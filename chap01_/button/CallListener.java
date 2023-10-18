package chap01_.button;

public class CallListener implements Button.OnClickListener {
// Button클래스안에 onClickListener인터페이스가 중첩돼있어서 .으로 접근해야한다
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");

	}

}
