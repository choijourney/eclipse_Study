package chap01_.genericTest;

public class Generics<T> {
	T name;

	public Generics(T name) {
		this.name = name;
	}

	public <T, V> void coffeeOrder(T name, V num) {
		System.out.println(name + " " + num + " 잔 주세요~");
		// name+num 으로 쓰면 name하고 num하고 더하는줄알고 오류남
	}
}
