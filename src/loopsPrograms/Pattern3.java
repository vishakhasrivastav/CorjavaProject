package loopsPrograms;

public class Pattern3 {

	public static void main(String[] args) {
		
		/*
		 * 	*
		 * 	* *
		 * 	* * *
		 * 	* * * *
		 * 	* * * * *
		 */
		
		
		for(int i=1; i<=5; i++) {
			
			for(int a=1; a<=i; a++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
