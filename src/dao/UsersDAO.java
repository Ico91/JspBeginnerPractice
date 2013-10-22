package dao;

import java.util.List;

import model.User;
import model.UsersList;

public class UsersDAO {
	public UsersDAO() {}
	
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
	
	public void updateUser(String id, User updateUser) {
		int index = 0;
		for (User u : UsersList.getUsers()) {
			if (u.getId().equals(id))
				index = UsersList.getUsers().indexOf(u);
		}
		
		UsersList.getUsers().remove(index);
		UsersList.getUsers().add(updateUser);
	}
}
