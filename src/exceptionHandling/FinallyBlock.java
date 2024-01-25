package exceptionHandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter two numbers: -");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			int div=num1/num2;
			
			System.out.println("Answer= "+div);
		}
		
		finally {
		System.out.println("Scanner is closing....");
		sc.close();
		}

		System.out.println("Thank you Visit again soon!!");
	}

}
