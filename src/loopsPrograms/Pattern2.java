package loopsPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		/*
		 * 2)
		 *  * * * * *
		 *  # # # # #
		 *  * * * * *
		 *  # # # # #
		 *  * * * * *
		 */
		
		for(int i=1; i<=5; i++) {
			
			for(int a=1; a<=5; a++) {
			
				if(i%2!=0) {
				System.out.print("* ");
					}
				else {
					
					System.out.print("# ");
				}
			}
		System.out.println();
		
		}

	}

}
