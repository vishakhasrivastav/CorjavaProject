package inheritance;
/*
 * super keyword represents immediate parent class object.
 * We can call the members of parent class from inside the child class by
 * using super keyword. This simplifies the class as we are accessing parent
 * class members without making the object of parent class. 
 */
class Animal{
	
	String type="Animal";
	
	public void display(){
		System.out.println("This is display method of animal class");
	}
}

class Giraffe extends Animal{
	
	String type="Giraffe";
	
	public void display() {
		
		System.out.println("Type= "+type);
		
		
		System.out.println("Type of Animal class= "+super.type);
		
		System.out.println("This is display method of Giraffe class");
		super.display();
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		Giraffe g=new Giraffe();
		g.display();

	}

}
