package stringPrograms;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		/*
		 * String institute="Anudip";
		 * Write a program to reverse this String.
		 * pidunA
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String institute=sc.next();
		
		String rev="";
		for(int i=institute.length()-1; i>=0; i--) {
			
			rev+=institute.charAt(i);
		}
		
		System.out.println(rev);
		
		if(institute.equals(rev)) {
			System.out.println("The word is Palindrome");
		}
		else
			System.out.println("Not Palindrome!!");
		

	}

}
