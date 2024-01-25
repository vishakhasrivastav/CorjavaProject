package fundamentals;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		/*
		 * Take the radius of the circle from user and then calculate the
		 * area and perimeter of the circle
		 * 
		 * area pi r squared
		 * perimeter 2 pi r
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of the circle: ");
		
		int radius=sc.nextInt();
		double pi=3.14;
		
		double area=pi*radius*radius;
		double perimeter=2*pi*radius;
		
		System.out.println("Area of the circle= "+area);
		System.out.println("Perimeter of the circle= "+perimeter);
		
	}

}
