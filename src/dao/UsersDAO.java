package dao;

import java.util.List;

import model.User;
import model.UsersList;

public class UsersDAO {
	public UsersDAO() {
		UsersList list = new UsersList();
	}
	
	public List<User> load() {
		return UsersList.getUsers();
	}
	
	public void add() {
		
	}
	
	public User getUser(String id) {
		for(User u : UsersList.getUsers()) {
			if(u.getId().equals(id))
				return u;
		}
		return null;
	}
}
