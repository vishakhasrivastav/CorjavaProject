package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ArrayList implements List interface
		 * Properties:-
		 * 1) Null are allowed.
		 * 2) Insertion order is maintained.
		 * 3) Members are not sorted implicitly.
		 * 4) Duplicates are allowed.
		 * 5) All members of the arraylist are given indexes starting from 0 to size-1
		 */
		
		/*
		 * Below we are seeing heterogeneous/non-generic collection.
		 * In this we can add any type of data.
		 * But this type of collection is not preferred as it does not give type safety.
		 * We should always make homogeneous/generic collection.
		 * 
		 * ArrayList list=new ArrayList();
		list.add("Anudip");
		list.add(10);
		list.add(true);
		list.add(4.5);
		list.add('$');
		list.add(null);
		list.add(4.5);
		list.add(4.5);
		list.add(4.5);
		
		System.out.println(list);
		 */
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ritu");//0
		names.add("Vishakha");//1
		names.add("Sumona");//2
		names.add("Aakash");//3
		names.add("Anshu");//4
		names.add("Alka");//5

		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println("\nAfter: "+names);
		
		System.out.println("\nNormal for loop..");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("\nUsing for each loop....");
		for(String n:names)
			System.out.println(n);
		
	}

}
