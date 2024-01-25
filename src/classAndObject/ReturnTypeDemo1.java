package classAndObject;

import java.util.Scanner;

/*
 * Return type declares the type of data/value that the method is going to
 * return at the end of its execution.
 */
public class ReturnTypeDemo1 {
	Scanner sc=new Scanner(System.in);
	
	public void display() {
		
		System.out.println("Enter number less than 10: ");
		int i=sc.nextInt();
		for(; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public boolean showSign() {
		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		if(num%2==0) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int add() {
		
		
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		
		return num1+num2;
	}
	
	public String welcomeMessage() {
		
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		
		return "Hi "+name+" welcome to Anudip Foundation!!!";
	}
	
	public static void main(String[] args) {
		
		ReturnTypeDemo1 r=new ReturnTypeDemo1();
		/*
		 * int total=r.add();
		 * 
		 * System.out.println("Total= "+total); int avg=total/2;
		 * 
		 * System.out.println("Average= "+avg);
		 */
		
		String message=r.welcomeMessage();
		System.out.println(message);
	}

}
