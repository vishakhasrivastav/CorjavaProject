package loopsPrograms;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		/*
		 * Take any number from user.
		 * count the number of digits in the given number.
		 * 
		 * Example:-
		 * 78651
		 * 
		 * Number of digits= 5
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num=sc.nextInt();
		int count=0;
		
		while(num>0)
		
		{
			
			num=num/10;
			count++;
		}
		
		System.out.println("The number of digits in the given number= "+count);

	}

}
