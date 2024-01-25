package collection;

public class WrapperClassDemo {

	public static void main(String[] args) {
		/*
		 * Wrapper class are used to convert primitive type data to object type.
		 * 
		 * Primitive		Wrapper class
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * 
		 * float			Float
		 * double			Double
		 * 
		 * char				Character
		 * boolean			Boolean
		 */
		
		int i=10;
		
		Integer j=i;
		
		System.out.println(j);
		float x=j.floatValue();
		System.out.println(x);
		
		Double marks=90.98;
		
		String name="Preet";
		
		Employee e=new Employee();

	}

}
