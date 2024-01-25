package stringPrograms;

import java.util.Arrays;

public class SplitDemo {
	
	public static void main(String[] args) {
		
		String s="Anudip Foundation NGO";
		String [] arr=s.split(" ");
		
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("s: "+s);
	}

}
