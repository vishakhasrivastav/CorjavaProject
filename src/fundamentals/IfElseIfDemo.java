package fundamentals;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		/*
		 * Below we are seeing an example of else if statement.
		 * In this program when the first if condition is not satisfied, then it will go to
		 * else if.
		 * In else if it will check if the number is greater than 5. If so then it will execute
		 * the else if
		 * But in case the number is not greater than 5 then automatically the last else will execute.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=sc.nextInt();//15
		
		if(num%2==0) {
			
			System.out.println("This is a good number...");
		}
		else if(num>5){
			
			System.out.println("This is a ok number");
		}
		else {
			System.out.println("This is a bad number");
		}

	}

}
