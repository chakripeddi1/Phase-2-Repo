package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Project {
	
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// This is DB connection string
		
		String dburl = "jdbc:mysql://localhost:3306/productsdb";
		String username = "root";
		String password = "11113434";
		
		//create connection
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to Database");
		
		String query = "select * from products where id =005";
		Statement stmt = con.createStatement(); // execute query
		
		ResultSet rs = stmt.executeQuery(query); 
		// see the result
	
		while(rs.next()) {
			
		
		System.out.print("id: " + rs.getString("id")+ "\t");
		System.out.print("name: " + rs.getString("name") + "\t");
		System.out.println("Price: " + rs.getString("Price"));
		}
		con.close();
		}
}