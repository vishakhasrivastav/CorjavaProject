package classAndObject;

import java.util.Scanner;

import fundamentals.Employee;
/*
 * Write a program where you demonstrate a compilable class
 * and an executable class.
 * compilable class name can be anything 
 * create few variables in the compilable class and assign data to
 * the variables.
 * print the values of the variables on console
 */
public class Example2 {
	
	public static void main(String args[]) {
		
		Trainer t=new Trainer();
		System.out.println("Id: "+t.trainerId);
		System.out.println("Name: "+t.trainerName);
		System.out.println("Branch: "+t.trainerBranch);
		
		Employee e=new Employee();
		System.out.println("Employee id= "+e.empId);
		Scanner sc=new Scanner(System.in);
		
		
	}

}
