package stringPrograms;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String s="The boy is standing near the house";
		boolean c=s.contains("house");
		
		System.out.println("Does the String contain 'house'? "+c);
		
		c=s.contains("dog");
		System.out.println("Does the String contain 'dog'? "+c);

	}

}
