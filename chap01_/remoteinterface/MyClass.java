package chap01_.remoteinterface;

public class MyClass {
	// field
	public RemoteControl rc = new Tv();  // 인터페이스에 구현객체저장
	
	// constrctor
	public MyClass() {
	
	}
	 
	public MyClass(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// method
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(6);
	}
}
