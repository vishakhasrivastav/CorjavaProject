package practiseProgram;

import classAndObject.AccessSpecifierDemo;

public class Demo2 {

	public static void main(String[] args) {

		
		  AccessSpecifierDemo a=new AccessSpecifierDemo(); System.out.println(a.myNum);
		  a.display();
		  
		  System.out.println("Accessing default members...."); 
		  /*We will not be able to
		  access default members from outside the package 
		  System.out.println(a.myNum2);
		  a.show();
		  
		  */
		  System.out.println("Accessing private members....");
		  
			/*
			 * Below given code we are accessing private members hence they are showing
			 * error. Because private members cannot be accessed from outside the class
			 * System.out.println(a.myNum3); a.add();
			 */
		  
		  
		  //a.myMethod();
		 
	}

}
