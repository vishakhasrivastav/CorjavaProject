package exceptionHandling;
/*
 * Exception is an abrupt termination of our program without reaching the last line of code.
 * 
 * As developers it is our responsibilty to make sure that all the correct lines of code is
 * executed even if there is an error code in our program.
 * This is done by exception handling.
 * 
 * Exception handling the process to write try and catch block in order to ensure that
 * our program does not get terminated in between and executes even the last line of code.
 * In try block we write those codes where exception may occur.
 * If an exception occurs then that is caught by the catch block.
 * 
 */
public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to this program");
		
		try {
		String s=null;
		System.out.println(s.charAt(2));
		
		
		
		  } catch(Exception e) {
		  System.out.println("Sorry an exeption has occured due to an error code!!"); 
		  }
		 
		
		for(int i=1; i<=5; i++) {
			
			for(int a=1; a<=i; a++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("Thank you for visiting this progam........");

	}

}
