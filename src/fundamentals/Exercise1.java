package fundamentals;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name=sc.next();
		
		System.out.print("Enter your email: ");
		String email=sc.next();
		
		System.out.print("Enter your mobile number: ");
		long contact=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter your address: ");
		String address=sc.nextLine();
		
		System.out.println("\n\n************************Employee Details*******************************");
		System.out.println("Name: "+name+"\nEmail: "+email+"\nContact number: "+contact+"\nAddress: "+address);

	}

}
