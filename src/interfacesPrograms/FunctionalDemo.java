package interfacesPrograms;
/*
 * Below we are seeing functional interface as it has only one abstract method.
 * Any class that implements functional interface will have to give implementation to 
 * only one method.
 */
interface CarManufacturer{
	public void assemblyLine();
}


public class FunctionalDemo implements CarManufacturer {

	public static void main(String[] args) {
		
		FunctionalDemo fd=new FunctionalDemo();
		fd.assemblyLine();
	}

	@Override
	public void assemblyLine() {
		
		System.out.println("Car is being manufactured in an assembly line format");
	}

}
