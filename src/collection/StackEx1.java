package collection;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		
		/*
		 * Stack is predefined class that extends Vector class
		 * It follows LIFO(Last In First Out)
		 * 
		 * 1) Null are allowed.
		 * 2) Insertion order is maintained.
		 * 3) Members are not sorted implicitly.
		 * 4) Duplicates are allowed.
		 * 5) All members of the Stack are given indexes starting from 0 to size-1
		 */
		Stack<String> s=new Stack<String>();
		s.add("Mango");
		s.add("Jackfruit");
		s.push("Chickoo");
		s.push("Strawberry");
		s.add("Pineapple");
		
		System.out.println(s);
		
		s.pop();//this method will delete the last member from the stack
		
		//s.remove("Jackfruit");
		System.out.println(s);

	}

}
