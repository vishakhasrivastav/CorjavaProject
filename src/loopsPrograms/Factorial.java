package loopsPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Take any number from user and calculate its factorial
		 * 
		 * num=4
		 * fact=1*2*3*4=24
		 * i=5		<=4
		 * 
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		
		int num=sc.nextInt();//storing the user input in the variable num
		int fact=1;
		
		for(int i= 1; i<=num; i++) {
			
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+"= "+fact);
	}

}
