package classAndObject;
/*
 * static keyword is used with variables methods and blocks to make those 
 * members belong to class and not the object.
 * Meaning as soon as we make any member static we do not require to make an
 * object to call that static member. 
 * 
 * static keyword is used for memory management, because static members are allocated memory
 * only once at the class loading stage.
 * Static members is shared by all objects.Meaning single copy for all objects.
 * Static members are allocated memory in PermGen part of heap memory.
 */
public class VariableTypes {

	int a=10;
	static int b=20;
	
	
	public void display() {
		
		System.out.println("This is the instance method display");
	}
	
	static public void show() {
		System.out.println("This is static method show");
	}
	public static void main(String[] args) {
		/*
		 * instance variable
		 * local variable
		 * static variable
		 */
		/*
		 * In both below seen cases we have never made object. We are accessing
		 * static members by its class name
		 */
		
		VariableTypes.show();//static method called directly by class name
		System.out.println(VariableTypes.b);//static variable called directly by class name

	}

}
