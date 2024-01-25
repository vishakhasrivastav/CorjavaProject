package interfacesPrograms;

interface Demo1{
	 int num1=60;
	
	
	public void display();
	public String show();
	public int myMethod(double d);
}

class MyDemo1 implements Demo1{

	@Override
	public void display() {
		System.out.println("How are everyone doing? ");
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "Gagandeep";
	}

	@Override
	public int myMethod(double d) {
		
		System.out.println("Double value recieved: "+d);
		return 100;
	}}

public class Example1 {

	public static void main(String[] args) {
		
		MyDemo1 m=new MyDemo1();
		m.show();
		m.myMethod(20.89);
		
		/*Interface objects cannot be created.
		 * Demo1 d=new Demo();
		 */

	}

}
