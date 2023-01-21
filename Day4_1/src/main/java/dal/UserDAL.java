package dal;
import pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import utils.DButils;

public class UserDAL {
	private Connection con;
	private PreparedStatement stmt;
	
	public UserDAL( ) {
		try {
			con=DButils.getCon();
			stmt=con.prepareStatement("select * from users where username=? and password=?");
			System.out.println("inside userDal");
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public User validateUser(String userName,String passWord) throws SQLException {
		System.out.println("Inside validate method"+userName+passWord);
		stmt.setString(1, userName);
		stmt.setString(2, passWord);
		
		ResultSet rset = stmt.executeQuery();
		User newUser=null;
		while(rset.next()) {
			
			newUser = new User(rset.getString("username"), rset.getString("password"));		
		}
			return newUser;
		
		
	}
	public void cleanUp() throws SQLException
	{
		System.out.println("---userDal cleanup-----");
		if(stmt!=null)
			stmt.close();
	}
	
}
