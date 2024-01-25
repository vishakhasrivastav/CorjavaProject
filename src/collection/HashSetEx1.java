package collection;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		
/*
 * Set Properties:-
 * 1) Duplicates are not allowed
 * 2) Insertion order is not maintained
 * 3) Members are not sorted, except for classes like TreeSet
 * 4) Usually null values are allowed except for TreeSet
 * 
 * HashSet is a predefined class implements Set interface
 */
		HashSet<String> hs=new HashSet<String>();
		hs.add("Rainy");
		hs.add("Winter");
		hs.add(null);
		hs.add("Summer");
		hs.add("Autumn");
		hs.add("Spring");
		
		
		System.out.println(hs);
		
	}

}
