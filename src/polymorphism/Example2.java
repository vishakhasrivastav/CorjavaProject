package polymorphism;
/*
 * In method overriding we make same method which is present in parent class
 * again in child class also.
 * Here we see same named method but with different behavior in parent and different 
 * behavior in child.
 * 
 * Use of method overriding:-
 * With the help of method overriding we can change the behavior of inherited method in 
 * our child class.
 */
class Person{
	
	public void display() {
		
		System.out.println("Hello class of ANP-C6370");
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Developer extends Person{
	
	public void display() {
		
		System.out.println("Navratri has begun...");
		System.out.println("Let the garba dance begin......");
		
	}
}
public class Example2 {

	public static void main(String[] args) {
		
		Developer d=new Developer();
		d.display();
	}

}
