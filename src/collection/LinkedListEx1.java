package collection;

import java.util.*;


public class LinkedListEx1 {

	public static void main(String[] args) {
		
		/*
		 * LinkedList is a predefined class that implements List, Deque
		 * Hence it has the properties of List, Deque and Queue also
		 * 
		 * Properties as a list:-
		 * 1) Null are allowed.
		 * 2) Insertion order is maintained.
		 * 3) Members are not sorted implicitly.
		 * 4) Duplicates are allowed.
		 * 5) All members of the arraylist are given indexes starting from 0 to size-1
		 * 
		 * Properties as a Queue:-
		 * 1) Null allowed.
		 * 2) Insertion order is maintained.
		 * 3) Duplicates are allowed.
		 * 4) Members are not sorted.
		 * 5) Members are not indexed.
		 * 6) It follows FIFO(First In First Out)
		 * 
		 * Properties as a Deque:-
		 * 1) Null allowed.
		 * 2) Insertion order is maintained.
		 * 3) Duplicates are allowed.
		 * 4) Members are not sorted.
		 * 5) Members are not indexed.
		 * 6) It follows FIFO(First In First Out) and LIFO(Last In First Out)
		 */
		
		List<String> days=new LinkedList<String>();//upcasting
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		
		System.out.println(days);
		System.out.println(days.get(1));
		
		Queue<String> colors=new LinkedList<String>();
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add(null);
		colors.add("Yellow");
		
		System.out.println("Before polling color: "+colors);
		colors.poll();//poll method is used to remove members from the queue. It follows FIFO
		System.out.println("After polling color: "+colors);
		
		Deque<String> months=new LinkedList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.offerFirst("May");//adding member at the start of the queue
		
		System.out.println("Before months: "+months);
		months.poll();//deleting the first member of the queue
		System.out.println("After poll months: "+months);
		months.pollLast();//deleting the last member of the queue
		System.out.println("After poll last months: "+months);

	}

}
