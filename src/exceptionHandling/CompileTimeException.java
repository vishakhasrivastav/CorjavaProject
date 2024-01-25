package exceptionHandling;
/*
 * Compile time exceptions are also known as Checked exceptions.
 * Such exceptions are checked by compiler and we are forced to handle it when we write the
 * code itself.
 * Examples:-
 * ClassNotFoundException, InteruptedException, SqlException etc
 */
public class CompileTimeException {

	public static void main(String[] args) {
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

}
