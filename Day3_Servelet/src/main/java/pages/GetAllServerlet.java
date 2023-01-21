package pages;
import java.io.*;
import java.sql.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.BookDal;
import pojo.Book;
import utils.DButils;

@WebServlet(value="/show",loadOnStartup=-1)
public class GetAllServerlet extends HttpServlet
{
	private static final long serialVersionUID =1L;
	
	BookDal bookDao;
	public void init (ServletConfig config) throws ServletException {
		try {
			System.out.println("inside init showall ");
			DButils.OpenConnection();
			bookDao = new BookDal();
			
		} catch (Exception e) {
			throw new ServletException("Error in init",e);
			// TODO: handle exception
		}
	}
	
	public void destroy() {
		System.out.println("inside destroy");
		try {
//			3DButils.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("inside do get");
		List<Book> bks =bookDao.getAllBooks();
		
		resp.setContentType("text/html");
		try(PrintWriter pw = resp.getWriter())
		{
			System.out.println("inside 1");
			if(bks != null) {
				for(Book b : bks)
				{
					System.out.println(b);
					System.out.println("inside 2");
					pw.write("Book"+b);
				}	
			}
			
			System.out.println("inside 3");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
