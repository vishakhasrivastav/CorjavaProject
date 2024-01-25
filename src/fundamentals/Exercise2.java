package fundamentals;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * Write a program so that the data in a and b are swapped 
		 */
		int a=8;
		int b=5;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a+b;//a=13
		b=a-b;//b=8
		a=a-b;//a=5
		
		System.out.println("After swapping...");
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
