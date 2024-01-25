package loopsPrograms;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		/*
		 * check if the number given by user is a palindrom or not
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		
		int num=121;
		
		System.out.println("Original number= "+num);
		int temp=num;
		
		int rev=0;
		/*
		 * num=0		>0
		 * rev=234
		 * rem=4
		 */
		while(num>0) {
			
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of the number= "+rev);
		
		if(temp==rev) {
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is NOT a palindrome");
		}
		
	}

}
