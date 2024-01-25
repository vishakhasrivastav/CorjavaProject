package jdbcPrograms;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementEx1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip","root", "Palakkal*078");
			String sql="insert into Student_6370 values (?, ?, ?, ?, ?)";
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your id: ");
			String id=sc.nextLine();
			
			System.out.print("Enter your name: ");
			String name=sc.nextLine();
			
			System.out.print("Enter your email: ");
			String email=sc.nextLine();
			
			System.out.print("Enter your marks: ");
			Double marks=sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Enter your trainer id: ");
			String trainerId=sc.nextLine();
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setDouble(4, marks);
			ps.setString(5, trainerId);
			
			int i=ps.executeUpdate();
			
			if(i>0)
				System.out.println("Data added to table successfully!!!");
			
			ps.close();
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
