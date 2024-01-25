package practiseProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Sujina");
		names.add("Pradeep");
		names.add("Tanush");
		names.add("Sreeja");
		names.add("Vasu");
		
		List<String> list=names.stream().map(x-> x.concat(" present")).toList();
		System.out.println(list);
		
		List<String> list2=names.stream().filter(x->x.toLowerCase().contains("su")).toList();
		System.out.println(list2);
		
		int[] nums= {1, 2, 3, 4};
		int [] doubleNum= Arrays.stream(nums).map(x->x*x).toArray();
		System.out.println(Arrays.toString(doubleNum));

	}

}
