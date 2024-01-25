package fundamentals;

public class RelationalOperators {

	public static void main(String[] args) {
		
		/*
		 * relational operators show the relation between two values
		 * 
		 * a>b  will check if a is greater than b
		 * a<b   will check if a is less than b
		 * a==b  will check if the value in a is exactly same as the value of b
		 * a<=b  will check if a is less than or equal to b
		 * a>=b  will check if a is greater than or equal to b
		 * a!=b  will check if a is not equal to b
		 */
		
		int a=7;
		int b=20;
		
		boolean answer1=a>b;
		
		System.out.println("Is a greater than b? "+answer1);
		System.out.println("Is a less than b? "+(a<b));
		System.out.println("Is a exactly equal to b? "+(a==b));
		System.out.println("Is a not equal to b? "+(a!=b));

	}

}
