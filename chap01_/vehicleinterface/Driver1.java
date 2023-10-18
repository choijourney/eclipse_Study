package chap01_.vehicleinterface;

public class Driver1 {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus1) {
			Bus1 bus1 = (Bus1) vehicle; // Bus1의 메서드를쓰기위해 강제형변환
			bus1.checkFare();
		}
		vehicle.run();
	}
}
