package collection;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		/*
		 * 1) Insertion order is not maintained.
		 * 2) Duplicates are not allowed in keys, values can be duplicate.
		 * 3) Null is allowed in key and value
		 * 4) Members are not sorted.
		 */
		HashMap<String, Long> contacts=new HashMap<String, Long>();
		contacts.put("Sunita", 1234567L);
		contacts.put("Devdas", 9123876L);
		contacts.put("Chameli", 12334567L);
		contacts.put(null, 65430987L);
		contacts.put("Circuit", 56782345L);
		contacts.put("Devdas", 1234567L);
		
		
		System.out.println(contacts);
		/*
		 * .keySet() always returns a Set of keys
		 * .values method always returns a Collection of values
		 */
		
		System.out.println("\nAll keys........");
		Set<String> names=contacts.keySet();
		System.out.println(names);
		
		System.out.println("\nAll values........");
		Collection<Long> mobileNums=contacts.values();
		System.out.println(mobileNums);
		
		System.out.println("\nEach pair separately.....");
		Set<Map.Entry<String, Long>> pairs=contacts.entrySet();
		for(Map.Entry<String, Long> p: pairs) {
			System.out.println(p);
		}
	}

}
