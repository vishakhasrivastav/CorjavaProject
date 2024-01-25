package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataRetrivalEx3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip","root", "Palakkal*078");
			String sql="select * from student_6370 where studentId=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the id of student: ");
			String id=sc.nextLine();
			
			ps.setString(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				System.out.println("Student id: "+rs.getString("studentId"));
				System.out.println("Student name: "+rs.getString("sname"));
				System.out.println("Student email: "+rs.getString("studentEmail"));
				System.out.println("Marks: "+rs.getDouble("avgMarks"));
				System.out.println("Trainer id: "+rs.getString("tId"));
				
			}
			else
				System.out.println("No student of this id found!!");
			
			ps.close();
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
