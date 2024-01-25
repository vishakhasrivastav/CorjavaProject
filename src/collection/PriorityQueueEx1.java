package collection;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		
		/*
		 * PriorityQueue is a class that implements Queue
		 * Properties:-
		 * 1)Null value is not allowed.
		 * 2)Insertion order is not maintained
		 * 3) It follows internally a separate alogorithm with which it will always
		 * keep the lowest priority member at the start of the queue.
		 * 4) We cannot make priorityqueue of user defined objects by default. If in case
		 * we want to add user defined objects in pq then we should comparable/comparator
		 * before doing so.
		 */
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(45);
		pq.add(2);
		pq.add(17);
		pq.add(81);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);

	}

}
