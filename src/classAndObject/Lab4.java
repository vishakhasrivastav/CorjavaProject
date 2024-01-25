package classAndObject;
class Car{
	
	public void startEngine() {
		System.out.println("Car is starting");
	}
	
	void stopEngine() {
		System.out.println("Car is stopping");
	}
	
	protected void increaseSpeed() {
		System.out.println("Car is accelerating");
	}
	
	private void fueling() {
		System.out.println("Fuel filled in tank");
	}
}

class Employee{
	
	public String monthlyDeduction() {
		
		return "Your monthly deduction is ....";
	}
	
	public void markingAttendance() {
		System.out.println();
	}
	
	public int showLeaveBalance() {
		return 10;
	}
}
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
