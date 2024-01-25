package classAndObject;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		System.out.println("Details of s1 object...");
		System.out.println("Id: "+s1.studentId);
		System.out.println("Name: "+s1.sname);
		System.out.println("Contact: "+s1.contact);
		System.out.println("Email: "+s1.email);
		System.out.println("Subject: "+s1.subject);
		
		Student s2=new Student(101, "Vidhi", "vidhi@gmail.com", 12345678, "Java");
		System.out.println("Details of s2 object...");
		System.out.println("Id: "+s2.studentId);
		System.out.println("Name: "+s2.sname);
		System.out.println("Contact: "+s2.contact);
		System.out.println("Email: "+s2.email);
		System.out.println("Subject: "+s2.subject);
	}

}
