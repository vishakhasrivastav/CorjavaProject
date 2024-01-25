package fundamentals;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("The given number is positive");
		}
		else {
			System.out.println("The given number is negative");
		}

	}

}
