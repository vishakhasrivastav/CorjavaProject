package practiseProgram;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="Happy Birthday Jimmy";
		
		char [] arr=s.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		
		  for(int i=0; i<arr.length; i++) {
		  
		  char ch1=arr[i];
		  
		  for(int j=i+1; j<arr.length; j++) {
		  
		  char ch2=arr[j];
		  
		  if(ch1==ch2) {
			  arr[i]=' ';
		  } 
		  } 
		  
		  }
		 
		  s=new String(arr).replace(" ", "");
		  System.out.println(s);
	}

}
