package classAndObject;
/*
 * Constructors are special method which are used to create an object of the
 * class. Constructors do not have a return type, not even void.
 * 
 * syntax:-
 * accessSpecifier className(parameters){}
 * 
 * Points to remember:-
 * 1) Name constructor is always same as the name of the class.
 * 2) There can be more than one constructor in a class. We just have to keep
 * different parameters.This is known as constructor overloading.
 * 
 * 3) Parameters can be made different by following way:-
 * 		a) Change the datatype of the parameter
 * 		b) Change the number of parameter.
 * 		c) Change the sequence of parameters.
 * 4) In case we do not make a constructor in our class then the compiler creates a default
 * constructor in our class.
 * 
 * 
 */
class Developer{
	
	public Developer() {
		System.out.println("This is non parameterized constructor");
	}
	
	public Developer(String s) {
		
		System.out.println("This is constructor with string parameter: "+s);
	}
	
	public Developer(int s) {
		
		System.out.println("This is constructor with string parameter: "+s);
	}
	
	public Developer(int s, double t) {
		
		System.out.println("This is constructor with string parameter: "+s);
	}
	
	public Developer( double t, int s) {
		
		System.out.println("This is constructor with string parameter: "+s);
	}
	
	public void coding() {
		System.out.println("Developer is coding.....");
	}
}

public class ConstructorsDemo {

	public static void main(String[] args) {
		
		Developer d=new Developer();
		d.coding();
		
		

	}

}
