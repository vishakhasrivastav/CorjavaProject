package classAndObject;

import java.util.Scanner;

/*
 * Create a method to print the table of a user given number.
 * The method should be parameterized.
 */
public class Exercise1 {
	
	public void printTable(int n) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+" x "+i+"= "+(n*i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Exercise1 e=new Exercise1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		
		int n=sc.nextInt();
		e.printTable(n);

	}

}
