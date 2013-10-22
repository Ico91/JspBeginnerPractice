package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDAO;

@WebServlet("/editUser")
public class EditUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsersDAO usersDao;
  
    public EditUserController() {
        super();
        usersDao = new UsersDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/edit.jsp");
		request.setAttribute("user", usersDao.getUser(request.getParameter("id")));
		
		rd.forward(request, response);
	}

}
