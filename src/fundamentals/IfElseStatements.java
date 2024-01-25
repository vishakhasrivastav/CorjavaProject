package fundamentals;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your marks: ");
		
		double marks=sc.nextDouble();//40
		
		if(marks>=60) {
			
		System.out.println("Excellent work. Keep it up");
		}
		else {
			
		System.out.println("Please put in more effort");
		}

	}

}
