package classAndObject;


public class ConstructorDemo3 {

	public static void main(String[] args) {
		
		Trainer t1=new Trainer();
		System.out.println("Values of t1...");
		t1.display();
		
		Trainer t2=new Trainer(10, "Sujina");
		System.out.println("\nValues of t2...");
		t2.display();
	}

}
