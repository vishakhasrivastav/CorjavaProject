package classAndObject;

public class Demo {

	public static void main(String[] args) {
		
		AccessSpecifierDemo a=new AccessSpecifierDemo();
		System.out.println(a.myNum);
		a.display();
		
		System.out.println("Accessing default members....");
		System.out.println(a.myNum2);
		a.show();
		
		System.out.println("Accessing private members....");
		/*
		 * Below given code we are accessing private members hence they are showing error.
		 * Because private members cannot be accessed from outside the class
		 * System.out.println(a.myNum3); a.add();
		 */

	}

}
