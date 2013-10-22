package model;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
	private static List<User> users = new ArrayList<User>();
	static {
		users.add(new User("admin", "123", UserType.ADMIN));
		users.add(new User("guest", "321", UserType.USER));
	}
	
	public UsersList() {	}
	
	public static List<User> getUsers() {
		return users;
	}
	
	public void addUser(String username, String password, UserType type) {
		users.add(new User(username, password, type));
	}
}
