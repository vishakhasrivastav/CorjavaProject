package loopsPrograms;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		 * Below we are trying to repeat a loop again and again.
		 * Therefore we are nesting that loop inside another loop.
		 * 
		 * Outer for loop decides how many times the inner for loop should run.
		 * 
		 * i=6   <=5
		 * a=1	 <=5
		 * 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 */
		for(int i=1; i<=5; i++) {
			
			for(int a=1; a<=5; a++) {
			
				System.out.print(a+" ");
			}
		System.out.println();
		
		}

	}

}
