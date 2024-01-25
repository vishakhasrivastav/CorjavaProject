package classAndObject;
/*
 * class is a template to write java code.
 * class is a blueprint of an object
 * class is a collection of objects, methods and variables.
 * 
 * Types of classes
 * 1) Predefined class
 * Are those that is created by the java creators. We just have to use those classes.
 * 
 * 2) User defined class
 * Are those that are created by the developers in their programs and applications.
 * 	a) Compilable class: class that does not have main method.
 * 	b) Executable class: class having main method.
 * 
 * 
 * Method:- All instruction which needs to be given to JVM have to be written inside
 * a method.
 * A method is a block of code which is executed only if we call it.
 * 
 * syntax:-
 * accessSpecifier returnType name(parameters){ instructions }
 */

class Student1{
	
	int rollNo=101;
	String name="Chandini";
	String subject="Java";
	
	
		public void display() {
		System.out.println("Hi everyone I am Student class....");
		
		}
	
}


public class Example1 {

	public static void main(String[] args) {
		/*
		 * A box of 10 chocolates
		 */

		System.out.println("Hi I am Example1 class....");
		
		Student1 s1=new Student1();
		
		System.out.println("Name of student= "+s1.name);
		s1.display();
	}

}
