package fundamentals;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your message: \t");
		
		String message=sc.nextLine();//it will scan entire sentence
		
		System.out.print("Please enter your name: ");
		
		String name=sc.next();//it will scan a word
		
		
		
		System.out.print("Enter your marks: ");
		
		double marks=sc.nextDouble();//it will scan double type data and store it in marks
		
		System.out.print("Enter your roll number: ");
		
		int rollNum=sc.nextInt();//it will scan int type data
		
		System.out.print("Enter the division of your class 10th: ");
		char div=sc.next().charAt(0);
		
		System.out.println("All the data recieved.......");
		System.out.println("Name: "+name);
		System.out.println("Message: "+message);
		System.out.println("Marks: "+marks);
		System.out.println("Roll number: "+rollNum);
		System.out.println("Division: "+div);
	}

}
