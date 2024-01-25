package abstractionExamples;
/*
 * final is a keyword which does not allow any changes to be made
 * It can be used with:-
 * 1) Variable:- a final variable value cannot be changed.
 * 2) Method:- a final method cannot be overridden.
 * 3) Class:- a final class cannot be extended.
 */

class FinalDemo1 extends FinalEx1{
	
	@Override
		public void display() {
			System.out.println("THIS IS CHILD CLASS DISPLAY METHOD");
		}
	
		/*Since show method is final in parent so we are not able to override it here
		 * void show() {
		 * 
		 * 
		 * }
		 */
	
}
 public class FinalEx1 {

	final int num=10;
	int num2=20;
	
	final String name="Anudip";
	
	public void display() {
		//num=40;
		num2=200;
		//name="Java Institute";
	}
	
	final void show() {
		
		System.out.println("This is the super show method!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
