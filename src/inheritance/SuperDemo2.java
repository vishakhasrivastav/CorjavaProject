package inheritance;

class Univ{
	
	Univ(){
		
		System.out.println("Non parameterized constructor of University");
	}
	
	Univ(String name){
		System.out.println(name+ " paramterized constructor of University");
	}
	
	
}

class College extends Univ{
	
	College(){
		super("Mumbai");
		System.out.println("Non parameterized constructor of College");
	}
	
	College(String name){
		System.out.println(name+" parameterized constructor of College");
	}
}
public class SuperDemo2 {

	public static void main(String[] args) {
		
		College c1=new College();
		//College c2=new College("Wilson");

	}

}
