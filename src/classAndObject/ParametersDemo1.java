package classAndObject;

public class ParametersDemo1 {

	public void add(int i, int j) {
		
		System.out.println("Addition= "+(i+j));
	}
	
	public void welcome(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		/*
		 * parameters are made to declare the inputs that are required to call
		 * the methods.
		 */
		
		ParametersDemo1 pd=new ParametersDemo1();
		int i=10;
		int j=20;
		
		int a=100;
		int b=200;
		
		pd.add(a, b);//passing values of a and b
		pd.add(i, j);//passing values of i and j
		pd.add(7, 8);//passing values directly
		
		
	}

}
