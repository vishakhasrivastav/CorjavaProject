package collection;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		/*
		 * TreeSet class implements SortedSet interface
		 * SortedSet interface extends Set interface
		 */
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Sumona");
		ts.add("Govind");
		ts.add("Akash");
		ts.add("Preet");
		
		System.out.println(ts);
	}

}
