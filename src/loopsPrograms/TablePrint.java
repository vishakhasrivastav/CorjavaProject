package loopsPrograms;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		
		/*
		 * Take user input of any number.
		 * Print the table of that number upto 10
		 * 
		 * 2x1=2
		 * 2x2=4
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		for(int i=1  ;i<=10 ; i++) {
			
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
