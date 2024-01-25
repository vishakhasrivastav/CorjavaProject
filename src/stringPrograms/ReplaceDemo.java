package stringPrograms;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		String s="Java Programming Language. Java previously had c based compiler";
		String s2=s.replace("Java", "Python");
		String s3=s.replaceFirst("Java", "Python");
		
		System.out.println("s= "+s);
		System.out.println("s2= "+s2);
		System.out.println("s3= "+s3);
		
		String t="Yellow Umbrella";
		String t2=t.replace('e', '7');
		
		System.out.println("t= "+t);
		System.out.println("t2= "+t2);

	}

}
