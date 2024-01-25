package stringPrograms;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name1=new String("Neha");
		
		System.out.print("Enter any name: ");
		String name2=sc.next();//will scan the user input and store it in name2
		
		int i=name1.compareTo(name2);
		
		if(i==0)
			System.out.println("Both names are same!!!");
		else
			System.out.println("Both names are different!!!");

	}

}
