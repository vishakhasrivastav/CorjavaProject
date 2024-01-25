package stringPrograms;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter password: ");
		String pass1=sc.next();
		
		System.out.print("Re-enter password: ");
		String pass2=sc.next();
		
		if(pass1.equals(pass2))
			System.out.println("Password accepted. Thankyou!!!");
		else
			System.out.println("The password re-entered does not match the first one. Try again!!");

	}

}
