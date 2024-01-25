package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		Employee e1=new Employee(500, "Nibedita", "Centre Manager", 50000.00);
		Employee e2=new Employee(101, "Sheetal", "Softskill Trainer", 15000.00);
		Employee e3=new Employee(012, "Abhay", "Sales Exec", 10000.00);
		Employee e4=new Employee(550, "Vibhor", "CTO", 150000.00);
		Employee e5=new Employee(116, "Tanush", "Java Faculty", 25000.00);
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		System.out.println("\nSorting on the basis of employee name:- ");
		
		Collections.sort(emplist);
		
		for(int i=0; i<emplist.size(); i++) {
			System.out.println(emplist.get(i));
		}
		
		
		System.out.println("\nSorting on the basis of employee id:- ");
		
		Collections.sort(emplist, new CompareEmpId());
		
		for(int i=0; i<emplist.size(); i++) {
			System.out.println(emplist.get(i));
		}
		
		System.out.println("\nSorting on the basis of employee salaries:- ");
		
		Collections.sort(emplist, new CompareEmpSalary());
		
		for(int i=0; i<emplist.size(); i++)
			System.out.println(emplist.get(i));
			
			
		
		

	}

}
