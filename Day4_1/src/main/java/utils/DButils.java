package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	private static Connection con ;
	public static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asus","root","root123");
		System.out.println("Connected to db");
	}
	public static Connection getCon() {
		return con;
	}
	public static void closeConnection() throws SQLException {
		if(con!=null) {
			con.close();
		}
	}
}
