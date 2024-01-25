package polymorphism;
/*
 * Upcasting: When parent type reference variable is used to refer to a child
 * type object.
 */
class DemoParent{
	
	public void display() {
		
		System.out.println("Parent display method");
	}
	
	public void welcomeMessage() {
		
		System.out.println("Welcome to our application");
	}
}

class DemoChild extends DemoParent{
	
	public void display() {
		System.out.println("Child display method");
	}
	
	public void add(int i, int j) {
		
		System.out.println("Answer= "+(i+j));
	}
	
	public void show() {
		
		System.out.println("Hello everyone!!");
	}
}
public class Casting {

	public static void main(String[] args) {
		
		
		DemoChild d=new DemoChild();//static binding
		d.display();
		d.show();
		d.add(10, 20);
		d.welcomeMessage();
		
		DemoParent p=new DemoChild();//upcasting
		p.display();
		p.welcomeMessage();
		/*Below we can see that add and show methods were child class methods
		 * and when we do upcasting we make the child object behave purely 
		 * as a parent. Therefore in upcasting we will not be able to call
		 * the child class exclusive methods, we will only be able to call 
		 * those methods which the child has inherited from parent class.
		 * p.add(100, 200);
		 * p.show();
		 */
		
		
		DemoParent p2=new DemoParent();
		p2.display();
	}

}
