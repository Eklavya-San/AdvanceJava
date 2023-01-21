package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pojo.Book;
import utils.DButils;

public class BookDALImpementation implements BookDAL {
	private Connection con;//connection variable 
	private Statement stmt;//statement variable which can read only data (select and retrive data queries)
	private ResultSet rst;//data retrived and stored in this variable 
	private PreparedStatement pstmt1,pstmt2,pstmt3; // variable in which you can use update create delete queries
	
	public BookDALImpementation  () throws  SQLException{
		con=DButils.getConnection();//connection created
		stmt = con.createStatement();
		System.out.println("Statement created for static sql");
		String queryInsert= "insert into books values(?,?,?)";
		pstmt1=con.prepareStatement(queryInsert);
		String queryUpdate = "update books set name=?,author=? where id=?";
		pstmt2=con.prepareStatement(queryUpdate);
		String queryDelete = "delete from books where id=?";
		pstmt3=con.prepareStatement(queryDelete);
		
		System.out.println("Statement created for dynamic sql");
		System.out.println("Book dal created");
				
	}
	@Override
	public List<Book> getAllBooks(){
		try {
			List <Book> allBooks = new ArrayList<Book>();
			
			rst =stmt.executeQuery("select * from books");
			while (rst.next()) {
				allBooks.add(new Book(
						rst.getInt("id"),
						rst.getString("name"),
						rst.getString("author")
						));
			}
			return allBooks;
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
		
	}
	@Override
	public int addBook(Book obj) {
		try {
			pstmt1.setInt(1,obj.getId());
			pstmt1.setString(2,obj.getName());
			pstmt1.setString(3,obj.getAuthor());


			int i = pstmt1.executeUpdate();
			System.out.println("inserted object "+obj);
			return i; 
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return 0;
	}
	@Override
	public int updateBook(Book obj) {
		try {
			pstmt2.setString(1,obj.getName());
			pstmt2.setString(2,obj.getAuthor());
			pstmt2.setInt(3,obj.getId());

			int i = pstmt2.executeUpdate();
			System.out.println("updated object"+obj);
			return i;


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int deleteBook(int id) {
		try {
			pstmt3.setInt(1,id);
			int i = pstmt3.executeUpdate();
			return i;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
