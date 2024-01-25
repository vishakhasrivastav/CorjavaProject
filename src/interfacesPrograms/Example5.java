package interfacesPrograms;

interface MyDemo5{
	
	public void display();
	public void show();
}
 abstract public class Example5 implements MyDemo5{

	public static void main(String[] args) {
		

	}

	@Override
	public void display() {
		System.out.println("Implementation of display method in sub class");
		
	}

}
