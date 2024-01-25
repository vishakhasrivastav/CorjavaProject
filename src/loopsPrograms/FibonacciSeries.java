package loopsPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		/*
		 */
		
		/*
		 * a=3
		 * b=5
		 * i=2		<=8
		 * c=5
		 * 
		 * 1 2 3 5
		 */
		int a=1;
		int b=2;
		System.out.print(a+" "+b);
		
		for(int i=1; i<=18; i++) {
			
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		

	}

}
