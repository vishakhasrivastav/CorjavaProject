package polymorphism;
/*
 * Polymorphism means same name different behaviour.
 * 
 * In java polymorphism is seen in two ways:-
 * 1) Overloading: Method overloading, constructor overloading are different ways of overloading.
 * In method/constructor we see same named methods/constructors in the same class but 
 * having different behavior.
 * We can do method overloading by making method with same name but different parameters..
 * Parameters can be made different by following way:-
 * 		a) Change the datatype of the parameter
 * 		b) Change the number of parameter.
 * 		c) Change the sequence of parameters.
 * 
 * 2) Method overriding:In this we make methods with same name in parent class and child class
 * but both will have different behaviors.
 * Use: To change the behavior of the inherited method in child class.
 * 
 */

class Calculator{
	
	public void add(int i, int j) {
		System.out.println("Welcome to the calculator app..");
		System.out.println("Adding two int values\nAnswer= "+(i+j));
	}
	
	 void add(String s, String t) {
		System.out.println("Adding two String values\nAnswer= "+(s+t));
	}
	
	protected void add(double i, double j) {
		System.out.println("Adding two double values\nAnswer= "+(i+j));
	}
}//end of Calculator class

public class Example1 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add(5.6, 7.8);
		c.add("Sumona", " Java student");
		c.add(14, 8);

	}

}
