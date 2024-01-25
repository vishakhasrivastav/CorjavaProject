package multithreadingPrograms;

class Person{
	
	public void eating() {
		System.out.println("Person is eating...");
	}
}
public class Practise {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.eating();
		//p.sleeping();
	}

}
