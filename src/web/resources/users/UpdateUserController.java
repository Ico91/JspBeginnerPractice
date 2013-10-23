package web.resources.users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserType;
import dao.UsersDAO;

@WebServlet("/update")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsersDAO usersDao;
       
    public UpdateUserController() {
        super();
        usersDao = new UsersDAO();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		
		User updateUser = new User();
		updateUser.setId(id);
		updateUser.setUsername(username);
		updateUser.setPassword(password);
		updateUser.setType(UserType.valueOf(type));
		
		usersDao.updateUser(id, updateUser);
	
		response.sendRedirect("editUser?id=" + id);
	}

}
