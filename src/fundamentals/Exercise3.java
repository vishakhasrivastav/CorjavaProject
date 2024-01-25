package fundamentals;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * Take marks of three subjects from student. Calculate the average marks obtained
		 * by student.
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter marks of English: ");
		int english=sc.nextInt();
		
		System.out.print("Enter marks of Maths: ");
		int maths=sc.nextInt();
		
		System.out.print("Enter marks of Science: ");
		int science=sc.nextInt();
		
		int total=english+maths+science;
		int avg=total/3;
		
		System.out.println("Average marks obtained by you: "+avg);
		

	}

}
