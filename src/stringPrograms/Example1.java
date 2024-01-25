package stringPrograms;

public class Example1  {

	public static void main(String[] args) {
	
		/*
		 * String is a predefined class used to store a sequence of characters.
		 * String class is a final class hence we will not be able to extend our class to
		 * String class.
		 * 
		 * We commonly use String literals to create String objects because if we use new
		 * keyword that every new keyword will create a new object even if we are storing
		 * same value in both objects
		 * 
		 * Whereas if we use String literals then even if we make many String variable with
		 * the same value internally the object is stored in SCP memory and only one single
		 * object will be created of one type of value; all the variables with this value will
		 * point to this single object only.
		 * 
		 * SCP:String Constant Pool
		 */
		String name1="Gagandeep";//literal way of creating string
		String name2="Gagandeep";
		
		String subject1=new String("Java");//string created with new keyword.
		String subject2=new String("Java");
		
		String s1=new String();
		
		char [] symbols= {'@', '&', '#'};
		String s2=new String(symbols);
		
		System.out.println("name1: "+name1);
		System.out.println("name2: "+name2);
		System.out.println("subject1: "+subject1);
		System.out.println("subject2: "+subject2);
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);

	}

}
