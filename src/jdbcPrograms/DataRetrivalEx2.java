package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataRetrivalEx2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip","root", "Palakkal*078");
			String sql="select * from student_6370";
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				
			System.out.println("Student id: "+rs.getString("studentId"));
			System.out.println("Student name: "+rs.getString("sname"));
			System.out.println("Student email: "+rs.getString("studentEmail"));
			System.out.println("Marks: "+rs.getDouble("avgMarks"));
			System.out.println("Trainer id: "+rs.getString("tId"));
			System.out.println("_________________________________________________________\n");
			
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
