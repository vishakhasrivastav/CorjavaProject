package classAndObject;
/*
 * Access specifiers or access modifiers are keywords that determine the accessibility or
 * visibility of variables, methods and other members
 * 
 * 1) public		-------------------------------
 * 2) protected		------------------------
 * 3) default		-------------
 * 4) private		------
 * 
 * public members can be accessed by all class within the package and also by all class from other
 * packages too.
 * 
 * protected members can be accessed by all class within the package and only the child classes
 * in other package.
 * 
 * default members can be accessed by all classes of same package only. No class of other
 * package can access default memebers.
 * 
 * private members can be accessed only within the class. No other class even if they are in
 * same package will be able to access these members.
 */
public class AccessSpecifierDemo {

	public int myNum=70;
	int myNum2=50;
	private int myNum3=80;
	
	private void add() {
		System.out.println("This is the private add method");
	}
	
	void show() {
		System.out.println("This is the default method show!!");
	}
	
	public void display() {
		System.out.println("This is the public display method");
	}
	
	protected void myMethod() {
		
		System.out.println("Protected method of Parent class");
	}
	public static void main(String[] args) {
		
		AccessSpecifierDemo a=new AccessSpecifierDemo();
		System.out.println(a.myNum3);
		a.add();
	}

}
