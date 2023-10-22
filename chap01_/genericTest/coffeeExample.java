package chap01_.genericTest;

public class coffeeExample {
	public static void main(String[] args) {
		Generics<String> coffee = new Generics<String>("모카프라프치노");
		System.out.println(coffee.name);
		coffee.coffeeOrder("바닐라라떼", 3);

		Generics<Integer> coffee1 = new Generics<Integer>(1);
		System.out.println(coffee1.name);
		coffee1.coffeeOrder("모카", 1);
	}
}
