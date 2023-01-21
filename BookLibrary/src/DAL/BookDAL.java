package DAL;

import java.util.List;

import pojo.Book;

public interface BookDAL {
	public List<Book>getAllBooks();
	public int addBook(Book newBook);
	public int updateBook (Book newBook);
	public int deleteBook (int id);
}
