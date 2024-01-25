package arraysPrograms;

public class ForEachLoopEx2 {

	public static void main(String[] args) {
		
String [][] states= {
				
				{"Mumbai", "Nagpur", "Pune"},//0
				{"Ghandhinagar", "Jamnagar", "Baroda"},//1
				{"Trishur", "Trivandrum", "Cochin"}//2
				
		};

for(String [] state:states) {
	
	for(String s: state) {
		
		System.out.print(s+" ");
	}
	System.out.println();
}

	}

}
