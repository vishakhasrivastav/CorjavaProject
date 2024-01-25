package fundamentals;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		/*
		 * 1) Take any number from the user. 
		 * Check if the number is even or odd
		 * 
		 * 2) Take any number from the user.
		 * Check if the number is positive or negative
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			
			System.out.println("The number you have given is even");
		}
		else {
			System.out.println("The number given is odd");
		}

	}

}
