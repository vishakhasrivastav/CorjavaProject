package inheritance;
/*
 * Inheritance is one of the OOPS concept which is used to reuse the code 
 * of one class in another.
 * 
 * It represents parent-child relation/ IS-A relation
 * Parent class is also known as super class or base class
 * Child class is also known as sub class or derived class
 * 
 * We create parent-child relation with extends keyword.
 */

/*
 * Below we are seeing an example of single inheritance
 */
class Oppo1{
	
	public void calling() {
		
		System.out.println("Connecting voice call.......");
	}
	
	public void texting() {
		System.out.println("Sending text messages........");
	}
}

class Oppo2 extends Oppo1{
	
	
	public void clickingPics() {
		
		System.out.println("Pictures clicked......");
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		Oppo2 o=new Oppo2();
		o.calling();
		o.texting();
		o.clickingPics();
	}

}
