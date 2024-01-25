package abstractionExamples;

 abstract class MyAbstract{
	
	public void display() {
		System.out.println("Hello...");
	}
	
	abstract public void show();
}

 /*
  * In the below given Demo2 class we will inherit display method and abstract show method
  * We have two options:-
  * 1) In Demo2 class we can properly give method body/implementation to show method
  * 2) We can keep it abstract in Demo2 also, but then we need to declare Demo2 also abstract
  */
 abstract class Demo2 extends MyAbstract{

	
}


public class Example2 {

	public static void main(String[] args) {
		
		/*
		 * Demo2 d=new Demo2();
		 * 
		 * d.display();
		 */
	}

}
