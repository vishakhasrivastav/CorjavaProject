package collection;

import java.util.ArrayDeque;

public class ArrayDequeEx1 {

	public static void main(String[] args) {
		
		/*
		 * ArrayDeque implements Deque interface.
		 * Properties:-
		 * 1) Null not allowed
		 * 2) Insertion order is maintained
		 * 3) Duplicates are allowed
		 * 4) Sorting of members is not done implicitly
		 * 5) It is doubly ended queue meaning we can add and remove members from both end
		 * of the queue.
		 * 6) Members are not given indexes
		 */
		
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.offer("Piano");
		ad.offer("Sitar");
		ad.offer("Flute");
		ad.offer("Drums");
		ad.offerFirst("Violin");
		
		System.out.println(ad);
		
		ad.poll();//removes first member
		System.out.println(ad);
		
		ad.pollLast();//removes the last member
		
		System.out.println(ad);
		
		

	}

}
