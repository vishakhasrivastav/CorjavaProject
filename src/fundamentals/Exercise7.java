package fundamentals;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		/*
		 * Take three numbers from user.
		 * Check which one of the three is the biggest
		 */
		
		Scanner sc=new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		num2=sc.nextInt();
		
		System.out.print("Enter third number: ");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			
			System.out.println(num1+" is the biggest number!!");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the biggest number!!");
		}
		else {
			System.out.println(num3+" is the biggest number!!");
		}
		
		

	}

}
