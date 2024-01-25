package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ritu");//0
		names.add("Vishakha");//1
		names.add("Sumona");//2
		names.add("Aakash");//3
		names.add("Anshu");//4
		names.add("Alka");//5
		
		Iterator<String> it=names.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		names.forEach((n)->{
			System.out.println(n);
		});

	}

}
