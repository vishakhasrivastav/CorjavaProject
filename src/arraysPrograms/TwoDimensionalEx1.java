package arraysPrograms;

import java.util.Arrays;

public class TwoDimensionalEx1 {

	public static void main(String[] args) {
		/*
		 * Two dimensional arrays are special arrays that store a group of arrays in it.
		 * These array are also homogenous type, meaning all member arrays should be of the
		 * same type
		 */
		
		String [] countries= {
				"India", //0
				"South Africa", //1
				"Australia", //2
				"New Zealand"//3
				};
		
		String [][] countries2= {
				
				{"Mumbai", "Nagpur", "Pune"},//0
				{"Ghandhinagar", "Jamnagar", "Baroda"},//1
				{"Trishur", "Trivandrum", "Cochin"}//2
				
		};
		
		System.out.println(countries2[1][0]);
		
		System.out.println("\nUsing for loop:-");
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(countries2[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
