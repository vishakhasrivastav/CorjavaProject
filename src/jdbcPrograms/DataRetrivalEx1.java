package jdbcPrograms;


import java.util.Scanner;
import java.sql.*;
public class DataRetrivalEx1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip","root", "Palakkal*078");
			String sql="select * from student_6370 where studentId='AF6005'";
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			/*
			 * rs.next() scans one row of data retrieved from table. If proper row is
			 * available then it returns true otherwise it returns false if no data/row is
			 * retrieved.
			 */
			if(rs.next()) {
				
				System.out.println("Student id: "+rs.getString("studentId"));
				System.out.println("Student name: "+rs.getString("sname"));
				System.out.println("Student email: "+rs.getString("studentEmail"));
				System.out.println("Marks: "+rs.getDouble("avgMarks"));
				System.out.println("Trainer id: "+rs.getString("tId"));
				
			}
			else
				System.out.println("No student of this id found!!");
			
			st.close();
			rs.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
