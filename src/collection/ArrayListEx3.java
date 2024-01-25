package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	public static void main(String[] args) {
		/*
		 * Collections is a predefined class used to manipulate members of collection.
		 * 
		 * All methods of Collections class are static, meaning you can directly call them
		 * with the class name.
		 * Collections class is a Singleton class, we will not be able to create its object.
		 * 
		 */
		ArrayList<Integer> rollNums=new ArrayList<>();
		rollNums.add(70);
		rollNums.add(12);
		rollNums.add(300);
		rollNums.add(8);
		rollNums.add(110);
		
		System.out.println("Before:\n"+rollNums);
		//Collections.sort(rollNums);
		
		rollNums.remove(2);
		
		System.out.println("\nAfter:\n"+rollNums);

	}

}
