package classAndObject;

public class Student {
	/*
	 * Variables that are created directly in class outside any method, blocks or constructor
	 * is known as instance variables.
	 */
	int studentId;
	String sname;
	String email;
	long contact;
	String subject;
	
	public Student() {
		System.out.println("No details of this student available");
	}
	/*
	 * i n e these are local variables. They have a limited scope. They will be visible only
	 * within the constructor, block or method where they have been created.
	 * 
	 * 
	 */
	public Student(int studentId, String sname, String email, long contact, String subject) {
		
		this.studentId=studentId;
		this.sname=sname;
		this.email=email;
		this.contact=contact;
		this.subject=subject;
	}
	
	
	public Student(String n, long c) {
		
		sname=n;
		contact=c;
	}
	
}
