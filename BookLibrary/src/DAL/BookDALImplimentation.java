package DAL;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import pojo.Book;
import utils.DButils;

public class BookDALImplimentation implements BookDAL {
	
	private Connection con ;
	private Statement stmt;
	private ResultSet rst;
	private PreparedStatement p1,p2,p3;
	
	public BookDALImplimentation() throws SQLException {
		con = DButils.getConnection();
		stmt=con.createStatement();
		String queryInsert ="insert into books values (?,?,?)";
		String queryUpdate ="update books set name=?,author=? where id=?";
		String queryDelete="delete from books where id=?";
		
		p1=con.prepareStatement(queryInsert);
		p2=con.prepareStatement(queryUpdate);
		p3=con.prepareStatement(queryDelete);
	}

	@Override
	public List<Book> getAllBooks() {
		try {
			List <Book> allBooks = new ArrayList<Book>();
			
			rst = stmt.executeQuery("select * from books");
			while (rst.next()) {
				allBooks.add(new Book(
						rst.getInt("id"),
						rst.getString("name"),
						rst.getString("author")
						));
				return allBooks;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int addBook(Book newBook) {
		try {
			p1.setInt(1, newBook.getId());
			p1.setString(2, newBook.getName());
			p1.setString(3, newBook.getAuthor());
			
			int i = p1.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int updateBook(Book newBook) {
		try {
			p2.setString(1, newBook.getName());
			p2.setString(2, newBook.getAuthor());
			p2.setInt(3, newBook.getId());
			
			int i = p2.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int deleteBook(int id) {
		try {
			p3.setInt(1, id);
			int i = p3.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

}
