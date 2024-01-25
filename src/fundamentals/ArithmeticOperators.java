package fundamentals;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		/*
		 * Arithmetic Operators are special symbols used to do mathematical calculation.
		 * 
		 * 			+    addition
		 * 			-     subtraction
		 * 			*    multiply
		 * 			/    will divide two numbers and give quotient as answer
		 * 			%    will divide two numbers and give remainder as answer
		 * 		
		 */

		int i=5;
		int j=2;
		
		int add=i+j;
		int sub=i-j;
		int mul=i*j;
		int div1=i/j;
		int div2=i%j;
		
		System.out.println("Addition of i and j= "+add);
		System.out.println("Subtraction of i and j= "+sub);
		System.out.println("Multiplying i and j= "+mul);
		System.out.println("Quotient after dividing i and j= "+div1);
		System.out.println("Remainder after dividing i and j= "+div2);
	}

}
