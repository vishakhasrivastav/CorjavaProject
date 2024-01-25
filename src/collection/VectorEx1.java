package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		/*
		 * Vector also is a predefined class that implements List.
		 * It is a legacy class.
		 * We can use Enumeration with Vector class to iterate the members of 
		 * Vector.
		 * 
		 * 1) Null are allowed.
		 * 2) Insertion order is maintained.
		 * 3) Members are not sorted implicitly.
		 * 4) Duplicates are allowed.
		 * 5) All members of the Vector are given indexes starting from 0 to size-1
		 */
		
		Vector<String> v=new Vector<>();
		v.add("Java");
		v.add("Python");
		v.add(null);
		v.add("JavaScript");
		v.add("SpringBoot");
		v.add("JavaScript");
		
		System.out.println(v);
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
