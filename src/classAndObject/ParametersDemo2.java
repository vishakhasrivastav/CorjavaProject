package classAndObject;

import java.util.Scanner;

class Myntra{
	
	public void placeOrder(String username, double totalBill) {
		
		System.out.println("Thank you "+username+" for placing the order.");
		System.out.println("Your total bill is : "+totalBill);
	}
}
public class ParametersDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username: ");
		String username=sc.nextLine();
		
		System.out.print("Enter totalBill: ");
		double totalBill=sc.nextDouble();
		
		Myntra m=new Myntra();
		m.placeOrder(username, totalBill);

	}

}
