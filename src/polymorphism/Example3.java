package polymorphism;
/*
 * If we do not use method overriding then child class will always execute the method as
 * 
 */
class Preet{
	
	public void jobApplication(String s) {
		System.out.println("Sending application by Post....");
	}
}
class PreetJr extends Preet{
	
	public void jobApplication(String s) {
		
		System.out.println("Sending application by email...");
	}
	
}


public class Example3 {

	public static void main(String[] args) {
		
		PreetJr pj=new PreetJr();
		pj.jobApplication("Hello");
	}

}
