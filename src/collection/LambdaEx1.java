package collection;
/*
 * Lambda expresssion is a special notation used to give implementation to the abstract 
 * method of a functional interface.
 * 
 * Syntax:-
 * functionalInterfaceName variable=(paranthesis of method)->{};
 * 
 * Note:-
 * Lambda expression CANNOT be used with any other type of interface.
 * It has to be used only with functional interface
 * Reason: in the lambda expression we do not specify the name of the interface, hence
 * it is automatically understood that the single method is given the implementation.
 * If there had been more than one method then it would be confusing as to which method
 * is the implementation given to.
 */

interface Camera{
	public void clickPic();
	
}

interface Printer{
	public Integer colorPrint(String color);
}
public class LambdaEx1 {

	public static void main(String[] args) {
		
		Camera c=()->{
			System.out.println("Camera is clicking the pic");
		};

		c.clickPic();
		
		Printer p=(color)->{
			System.out.println("The printer is printing in color: "+color);
			return 90;
		};
		p.colorPrint("Violet");
	}

	
}
