package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) {
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip?user=root&password=Palakkal*078");
			Statement st=con.createStatement();
			String sql="update Student_6370 set sname='Pankaj Gupta' where studentId='AF5683'";
		
			int i=st.executeUpdate(sql);
			
			if(i>0)
				System.out.println("Data updated in the table successfully");
			
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
