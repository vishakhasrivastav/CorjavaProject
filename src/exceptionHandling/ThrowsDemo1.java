package exceptionHandling;

class Demo1{
	
	public void display() throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
	}
}
public class ThrowsDemo1 {

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		try {
			d.display();//ClassNotFoundException e=new ClassNotFoundException();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
