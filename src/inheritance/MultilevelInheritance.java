package inheritance;

class Person{
	String company="Worl Health Organization";
	public void eating() {
		System.out.println("Person is eating");
	}
	public void walking() {
		System.out.println("Person is walking...");
	}
}
class Employee extends Person{
	String company="Anudip";
	public void markAttendance() {
		
		System.out.println("company= "+super.company);
		System.out.println("Your attendance is marked.....");
	}
}

class Developer extends Employee{
	
	public void coding() {
		System.out.println("Developer is coding....");
		System.out.println("company= "+super.company);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Developer d=new Developer();
		d.coding();
		d.markAttendance();
		d.eating();
		d.walking();
		
		Employee e=new Employee();
		e.eating();
		
	}

}

