package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProjectDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip","root", "Palakkal*078");
			String sql="select * from student_6370";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			ArrayList<Student> slist=new ArrayList<Student>();
			
			while(rs.next()) {
				Student s=new Student();
				s.setStudentId(rs.getString("studentId"));
				s.setSname(rs.getString("sname"));
				s.setStudentEmail(rs.getString("studentEmail"));
				s.setAvgMarks(rs.getDouble("avgMarks"));
				s.settId(rs.getString("tId"));
				
				slist.add(s);
			}
			
			System.out.println("**********All the students retrieved from database**************");
			for(Student s: slist) {
				System.out.println(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
