package abstractionExamples;
/*
 * Abstraction is the process of hiding the implementation of the method and
 * showing only the functionality of the method.
 * 
 * In java we make abstract method where we define the method but do not 
 * give any implementation. Such methods are to be declared abstract.
 * 
 * If your class contains any abstract method then it is compulsory to
 * declare the class also abstract.
 * 
 * Any child class of the abstract class has to give implementation to all 
 * abstract methods inherited by it.
 */

abstract class RobotPrototype{
	
	public void talking() {
		
		System.out.println("Robot is talking....");
	}
	
	public void walking() {
		
		System.out.println("Robot is walking....");
	}
	
	abstract public void dancing(String dance);
}

class SumonaRobot extends RobotPrototype{
	
	public void dancing(String dance) {
		
		System.out.println("My robot is doing Bharat Natyam");
	}
}

class VidhiRobot extends RobotPrototype{
	
	public void dancing(String dance) {
		
		System.out.println("My robot is doing Break dancing...");
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		//RobotPrototype r=new RobotPrototype();
		
		SumonaRobot sr=new SumonaRobot();
		sr.walking();
		sr.talking();
		sr.dancing("Hello");
		
		VidhiRobot vr=new VidhiRobot();
		vr.walking();
		vr.talking();
		vr.dancing("Thank you");

	}

}
