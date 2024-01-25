package exceptionHandling;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: -");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
		int div=num1/num2;
		
		System.out.println("Answer= "+div);
		}
		catch(Exception e) {
			
			System.out.println("Please don't give 0 as the second number!!!");
		}
		System.out.println("Thank you for using our calculator!!!");

	}

}
