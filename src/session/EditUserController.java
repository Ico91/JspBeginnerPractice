package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserType;
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
		new RequestManager(request, response) {
			@Override
			public void request() {
				request.setAttribute("types", UserType.values());
				request.setAttribute("user", usersDao.getUser(request.getParameter("id")));
				
			}
		}.forward("/edit.jsp");
		
	}

}
