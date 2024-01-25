package jdbcPrograms;
/*
 * JDBC: Java Database Connection
 * Steps:-
 * 1) import java.sql.*;
 * 2) load our driver :- Class.forName("com.mysql.cj.jdbc.Driver");
 * 3) connection:- DriverManager.getConnection("");
 * 4) Statement/PreparedStatement:- connection.createStatement()/connection.prepareStatement() 
 * 5) ResultSet:- statement.executeQuery("")/preparedStatement.executeQuery();
 * 6) close all the connections and streams
 */

import java.sql.*;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c6370_anudip?user=root&password=Palakkal*078");
			Statement st=con.createStatement();
			String sql="insert into Student_6370 values ('AF6010', 'Pritwish', 'pritwish@gmail.com', 78.22, 'T501')";
		
			int i=st.executeUpdate(sql);
			
			if(i>0)
				System.out.println("Data inserted in the table successfully");
			
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
