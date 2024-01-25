package arraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String [] names=new String[8];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 8 names...");
		
		for(int i=0; i<names.length; i++) {
			
			System.out.print("Enter name : ");
			names[i]=sc.nextLine();//scanning the name and storing it in the array
		}
		
		/*
		 * Arrays is a predefined class used to manipulate our array in a much better way.
		 * .toString method is a static method of Arrays class. We can pass any array in 
		 * the toString method and we will be able to print the array without using for loop
		 */
		System.out.println(Arrays.toString(names));

	}

}
