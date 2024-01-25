package arraysPrograms;

public class ForEachLoopEx1 {

	public static void main(String[] args) {
		/*
		 * for each loop is a special loop used to iterate or fetch members of
		 * an array or collection one at a time.
		 * 
		 * Syntax:-
		 * for(datatypeOfArray variable: arrayName){}
		 */
		
		String [] countries= {"India", "South Africa", "Australia","New Zealand"};
		
		for(String s:countries) {
			
			System.out.println(s);
		}
		
		int [] arr= {6, 2, 9, 12};
		for(int a: arr) {
			System.out.println(a);
		}

	}

}
