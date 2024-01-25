package fundamentals;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		num2=sc.nextInt();
		
		System.out.print("Enter third number: ");
		num3=sc.nextInt();
		/*
		 * Below we are seeing nested if else.
		 * We have made an if else statement inside the first if statement
		 * 
		 * This type of nested if else is not much preferred because it makes the code messy and
		 * unreadable
		 */
		if(num1>num2) {
			
			if(num1>num3) {
				
				System.out.println(num1+" is the biggest number");
			}
			else {
				System.out.println(num3+" is the biggest number");
			}
			
		}//end of first if
		
		else if(num2>num3) {
			System.out.println(num2+" is the biggest number");
		}//end of else if
		
		else {
			System.out.println(num3+" is the biggest number");
		}//end of else

	}//end of main method

}//end of class
