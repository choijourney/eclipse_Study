package chap01_.phoneabstract;

public class SmartPhone extends Phone_ {
	// 부모객체를 상속받을때 부모생성자 매개변수값이 있으면
	// 자식객체 생성자에 super의 인수에 매개변수값을 써야함
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

}
