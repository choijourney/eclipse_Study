package chap01_.member;

public class Member {
	public String id; // Object클래스의 equals메서드 오버라이딩
						// 원래는 객체 참조가 같은지 비교하는 메서드임

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { // 인수로 사용될때 Object로 자동변환
		if (obj instanceof Member) { // 원래 Member객체였는지 확인하고
			Member member1 = (Member) obj; // 다시 Member로 강제변환

			if (id.equals(member1.id)) { // 문자열이 같은지 확인
				return true; // 리턴을쓰면 메서드를 종료시킴
			}
		}
		return false;
	}
}
