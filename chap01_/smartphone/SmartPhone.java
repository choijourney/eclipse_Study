package chap01_.smartphone;

public class SmartPhone { // toString 재정의
	private String company;
	private String os;

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + " , " + os;
	}
}
