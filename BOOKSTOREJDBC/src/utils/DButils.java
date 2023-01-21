package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	private static Connection con ;
	
	public static void OpenConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","root123");
		System.out.println("Connected to db");
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void closeConnection () throws SQLException{
		if(con!=null) {
			con.close();
		}
	}

}
