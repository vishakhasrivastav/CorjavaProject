package fundamentals;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		/*
		 * Create a calculator type program where user gives two numbers,
		 * Then add, subtract, multipy or divide according to what the
		 * user wants
		 */
		
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		char operator;
		
		System.out.print("Enter the first number: ");
		num1=sc.nextInt();
		
		System.out.print("Enter the second number: ");
		num2=sc.nextInt();
		
		System.out.println("Enter the following for further calculation: ");
		System.out.println("+ for addition\n- for subtraction\n* for multiplication\n/for division");
		
		operator=sc.next().charAt(0);
		
		switch(operator) {
		
		case '+': System.out.println("Answer= "+(num1+num2));
		break;
		
		case '-': System.out.println("Answer= "+(num1-num2));
		break;
		
		case '*': System.out.println("Answer= "+(num1*num2));
		break;
		
		case '/': System.out.println("Answer= "+(num1/num2));
		break;
		
		default:System.out.println("Please give inputs as mentioned in above menu....");
		}
		
	}

}
