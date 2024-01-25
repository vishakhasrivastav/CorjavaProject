package exceptionHandling;

import java.util.Scanner;
/*
 * We can make our own exceptions with the following steps:-
 * 1) Our class should be part of the Exception hierarchy. So we should extend our class
 * with either Exception class:- this will make our exception a compiletime exception
 * or extend with RuntimeException class:- this will make our exception a runtime exception.
 * 
 * 2) Make constructors and basic methods in the exception class.
 * 
 * 3) We use throw keyword to specify on which error code our exception should occur.
 */
class NotElligibleToVoteException extends Exception{
	
	public NotElligibleToVoteException() {
		System.out.println("You have to be more than 18 years old to vote!!!");
	}
	
	@Override
	public String getMessage() {
		
		return "Age given is under 18!!";
	}
	
	@Override
	public String toString() {
		
		return "exceptionHandling.NotElligibleToVoteException: Age given is under 18!!";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		/*
		 * throw keyword is used to forcefully generate an exception in our program.
		 * Most commonly we use throw keyword when we want to generate our own userdefined exception.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		
		if(age<18) {
			try {
			throw new NotElligibleToVoteException();
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Eligible to vote!!!");
		}

	}

}
