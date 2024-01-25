package stringPrograms;

public class StartsWithEndsWith {

	public static void main(String[] args) {
		
		String s="Java Programming Language. Java previously had c based compiler";
		
		System.out.println("Does our string start with java? "+s.startsWith("Java"));
		System.out.println("Does our string start with India? "+s.startsWith("India"));
		System.out.println("Does our string end with ler? "+s.endsWith("ler"));
		System.out.println("Does our string end with anudip? "+s.endsWith("anudip"));

	}

}
