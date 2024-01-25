package practiseProgram;

public class Lab {
	public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
 
        boolean[] encountered = new boolean[256]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
 
            if (!encountered[c]) {
 
                result.append(c);
                encountered[c] = true;
            }
        }

        return result.toString();
    }
	public static void main(String[] args) {
		String s="Anudip Foundation NGO";
		String[]a=s.split(" ");
		
		for(int i=a.length-1;i>=0;i--) { 
		   for(int j=1;j<a.length;j++) {
			   
	        	System.out.print(a[j]+" ");
			    }
			    System.out.println();
			
			}
	}

}
