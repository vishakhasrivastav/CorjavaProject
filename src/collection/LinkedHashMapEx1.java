package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		/*
		 * It is same as HashMap the only difference being that in LinkedHashMap 
		 * insertion order is maintained.
		 */
		
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		lh.put(1, "Chintu");
		lh.put(2, "Mintu");
		lh.put(3, "Pintu");
		lh.put(4, "Shintu");
		
		System.out.println(lh);

	}

}
