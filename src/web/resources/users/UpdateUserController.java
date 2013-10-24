package web.resources.users;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ParametersToBeanConverter;
import model.User;
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
		User updateUser = ParametersToBeanConverter.populate(User.class, request);
		
		usersDao.updateUser(updateUser.getId(), updateUser);
	
		response.sendRedirect("editUser?id=" + updateUser.getId());
	}

}
