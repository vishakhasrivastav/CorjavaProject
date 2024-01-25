package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		/*
		 * It is same as HashSet the only difference being that in LinkedHashSet 
		 * insertion order is maintained.
		 */
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Rainy");
		hs.add("Winter");
		hs.add(null);
		hs.add("Summer");
		hs.add("Autumn");
		hs.add("Spring");
		
		//System.out.println(hs);
		
		hs.forEach((s)->{
			System.out.println(s);
		});
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
