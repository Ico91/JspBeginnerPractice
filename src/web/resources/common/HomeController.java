package web.resources.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.requests.RequestManager;
import dao.UsersDAO;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		super();
	}

	public void doGet(final HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		new RequestManager(request, response) {

			@Override
			public void request() {
				UsersDAO usersDao = new UsersDAO();
				request.setAttribute("users", usersDao.load());
				
			}
			
		}.forward("/users.jsp");
	
	}
}
