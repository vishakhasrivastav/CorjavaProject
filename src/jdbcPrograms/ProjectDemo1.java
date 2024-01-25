package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProjectDemo1 {

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
				Student s=new Student();
				s.setStudentId(rs.getString("studentId"));
				s.setSname(rs.getString("sname"));
				s.setStudentEmail(rs.getString("studentEmail"));
				s.setAvgMarks(rs.getDouble("avgMarks"));
				s.settId(rs.getString("tId"));
				
				System.out.println(s);
			}
			else
				System.out.println("No students found with this id");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
