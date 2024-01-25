package abstractionExamples;

final  class Animal{
	
	public void grow() {
		System.out.println("Animal is growing...");
	}
}

/* 
 * Below give Dog class is trying to extend a final class Animal.
 * This is not allowed.
 * class Dog extends Animal{} 
 * 
 */

public class FinalEx2 {

	public static void main(String[] args) {
		String s="Hello";
		Animal a=new Animal();
		a.grow();

	}

}
