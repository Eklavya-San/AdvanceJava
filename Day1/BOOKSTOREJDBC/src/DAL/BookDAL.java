package DAL;
import java.util.List;

import pojo.Book;
public interface BookDAL {
List <Book> getAllBooks();
	int addBook(Book obj);
	int updateBook(Book obj);
	int deleteBook (int id);
}
