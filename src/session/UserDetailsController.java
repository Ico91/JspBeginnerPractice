package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDAO;

@WebServlet("/details")
public class UserDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserDetailsController() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		new RequestManager(request, response) {
			
			@Override
			public void request() {
				UsersDAO usersDao = new UsersDAO();
				request.setAttribute("user", usersDao.getUser(request.getParameter("id")));
			}
		}.forward("/details.jsp");
	}
}
