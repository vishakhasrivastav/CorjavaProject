package practiseProgram;

import classAndObject.AccessSpecifierDemo;
import interfacesPrograms.MyInterface;

public class ProtectedAccessDemo extends AccessSpecifierDemo {

	public static void main(String[] args) {
		
		ProtectedAccessDemo p=new ProtectedAccessDemo();
		p.myMethod();
		
		/*
		 * Below we can see that we are able to access the variables of the 
		 * interface MyInterface which was in a completely different package
		 * Hence proving that the variables in interface are always public
		 * 
		 * We are accessing the variables just by interface name, thus 
		 * proving that the variables in interface are always static
		 * 
		 * 
		 * We are not able to change the value of the variable, thus proving
		 * that the variables in interface are always final
		 */
		System.out.println("The variables in inter MyInterface are...");
		System.out.println("num= "+MyInterface.num);
		System.out.println("name= "+MyInterface.name);
		//MyInterface.name="Sujina";

	}

}
