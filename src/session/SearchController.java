package session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UsersList;

@WebServlet("/search")
public class SearchController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		new RequestManager(request, response) {

			@Override
			public void request() {
				request.setAttribute("users", search(request.getParameter("search")));
			}
		}.forward("users.jsp");
		
	}
	
	private List<User> search(String searchTerm) {
		List<User> listOfUsers = UsersList.getUsers();
		List<User> usersToReturn = new ArrayList<User>();
		
		if(searchTerm == null)
			return usersToReturn;
		
		for(User u : listOfUsers) {
			if(u.getUsername().contains(searchTerm))
				usersToReturn.add(u);
		}

		return usersToReturn;
	}
}
