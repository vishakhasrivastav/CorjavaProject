package arraysPrograms;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		/*
		 * Create an array of int type size 5. Take user input to store
		 * data in this array. Print only the even numbers given by user.
		 */
		
		int num []=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numbers...");
		
		for(int i=0; i<num.length; i++) {
			
			System.out.print("Enter number : ");
			num[i]=sc.nextInt();//scanning the name and storing it in the array
			
			
		}
		
		System.out.println("All even numbers are...");
		for(int i=0; i<num.length; i++) {
			
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}

	}

}
