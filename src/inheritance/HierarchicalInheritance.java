package inheritance;

class Honda{
	
	String logo="H";
}

class Activa extends Honda{
	
	public void kickStart() {
		System.out.println("Starting Activa....");
	}
}
class City extends Honda{
	
	public void reversing() {
		System.out.println("Car is reversing...");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Activa a=new Activa();
		System.out.println(a.logo);

	}

}
