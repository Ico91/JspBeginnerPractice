package web.resources.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ParametersToBeanConverter;
import model.User;
import model.UserType;
import dao.UsersDAO;
import dto.LoginRequest;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		LoginRequest loginRequest = ParametersToBeanConverter.populate(LoginRequest.class, request);
		
		UsersDAO usersDao = new UsersDAO();
		for (User u : usersDao.load()) {
			if (u.getUsername().equals(loginRequest.getUsername())
					&& u.getPassword().equals(loginRequest.getPassword())) {
				if (u.getType() == UserType.ADMIN) {
					response.sendRedirect("home");
				}
			}
		}

	}
}
