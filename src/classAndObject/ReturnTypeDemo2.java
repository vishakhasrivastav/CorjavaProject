package classAndObject;

import java.util.Scanner;

/*
 * Create a method which returns the area of a circle.
 */
public class ReturnTypeDemo2 {

	public double area() {
		
		System.out.println("Enter the radius..");
		int radius=new Scanner(System.in).nextInt();
		double pi=22/7;
		
		return pi*radius*radius;
	}
	public static void main(String[] args) {
		
		ReturnTypeDemo2 rt=new ReturnTypeDemo2();
		double a=rt.area();
		System.out.println("Area= "+a);
	}

}
