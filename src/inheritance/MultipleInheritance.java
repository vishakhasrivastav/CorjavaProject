package inheritance;
/*
 * Below we are seeing multiple inheritance wher we are trying to
 * make Demo as sub class of A and B both.
 * This is not allowed in Java
 */
class A{
	
	public void display() {
		System.out.println("display method of A");
	}
}
class B{
	
	public void show() {
		System.out.println("show method of B");
	}
}

class Demo extends A //, B
{
public void add() {
	System.out.println("Add method of Demo");
}	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		

	}

}
