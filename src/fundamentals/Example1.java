package fundamentals;

public class Example1 {

	public static void main(String[] args) {
	
		/*
		 * variables are containers used to store data temporarily.
		 * 
		 * In java when we create variables we have to give datatype to the variable.
		 * Datatype declares what type of data you are going to store in the variable along with the size of memory
		 * needed to store that data.
		 * 
		 * Primitive datatypes:-
		 * 
		 * A) Numerical datatypes:-
		 * 		1) byte----> 1byte
		 *		2) short---> 2bytes
		 *		3) int------> 4bytes
		 * 		4) long----> 8bytes
		 * 
		 * 		5)float----> 4 bytes
		 * 		6)double-> 8 bytes
		 * 
		 * 
		 * B) Non-Numerical datatypes:-
		 * 	
		 * 		1)char ---> 2bytes
		 * 		2) boolean-> 1 bit
		 * 
		 * Non Primitive datatypes:-
		 * These are not confined to fixed memory size
		 * Few examples...
		 * 		1)Arrays
		 * 		2)Class objects
		 * 		3) String
		 */
		
		int a=67;
		
		a=a+20;
		
		long x=79006789024l ;
		
		float marks=78.45f;
		
		double price=99.99;
		
		char div='A';
		char sign='%';
		char rating='5';
		
		boolean fresher=false;
		
		System.out.println("x= "+x);
		System.out.println("marks= "+marks);
		System.out.println("fresher= "+fresher);
		
		String institute="Anudip";
		String message="We are joining this session online...";
	}

}

