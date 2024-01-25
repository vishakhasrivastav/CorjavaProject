package loopsPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		
		/*
		 * i=3		>=1
		 * j=1		<=3
		 * 
		 * 5 5 5 5 5
		 * 4 4 4 4
		 * 3 3 3
		 * 2 2
		 * 1
		 */
		
		for(int i=5; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
