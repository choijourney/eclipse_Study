package chap01_.key;

public class Key {
	public int number; // Object클래스의 equals메서드 오버라이딩

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) { // 인수에서 Object로 자동형변환
		if (obj instanceof Key) { // 원래 Key객체였다면
			Key compareKey = (Key) obj; // Key로 강제형변환
			if (number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
}
