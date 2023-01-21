package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.UserDAL;
import pojo.User;
import utils.DButils;


@WebServlet(value="/AuthServlet",loadOnStartup = -1)
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAL userDao;
    
    public AuthServlet() {
        super();
       
    }

	
	public void init(ServletConfig config) throws ServletException {
		try {
			DButils.openConnection();
			userDao = new UserDAL();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void destroy() {
		try {
			userDao.cleanUp();
			DButils.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try(PrintWriter pr = response.getWriter();){
			pr.write("<h1> Welcome to Personality test");
			pr.write("<hr>");
			
			String username= request.getParameter("txtuser");
			String pwd =request.getParameter("txtpwd");
			
			pr.write("<h3>Welcome:" + username+"</h3>");
			
			User userObj = userDao.validateUser(username, pwd);
			if(userObj != null) {
				pr.write("<h3> Valid User"+ username + "</h3>");
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
