package fundamentals;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * logical operators are those that will compare two conditions
		 */
		
		Scanner sc=new Scanner(System.in);
		
		double marks, experience;
		
		System.out.print("Enter your marks: ");
		marks=sc.nextDouble();
		
		System.out.print("Enter your work experience: ");
		experience=sc.nextDouble();
		
		System.out.println("Is candidate eligible for Accenture? "+((marks>=60) && (experience>=2)));
		System.out.println("Is candidate eligible for GSLab? "+((marks>=60) || (experience>=2)));

	}

}
