package stringPrograms;

import java.util.Scanner;

public class EqualsCompareToDemo {

	public static void main(String[] args) {
		/*
		 * equals(string)method will check if both the string are exactly equal to each other or not
		 * If both Strings are exact match then equals method will return true. Otherwise it
		 * returns false.
		 */
		Scanner sc=new Scanner(System.in);
		
		String name1=new String("Neha");
		
		System.out.print("Enter any name: ");
		String name2=sc.next();//will scan the user input and store it in name2
		
		boolean result=name1.equals(name2);
		
		System.out.println("Are both names same? "+result);

	}

}
