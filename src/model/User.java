package model;

import java.util.UUID;

public class User {
	private String id;
	private String username;
	private String password;
	private UserType type;
	
	public User() {}
	
	public User(String username, String password, UserType type) {
		super();
		this.id = UUID.randomUUID().toString();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", type=" + type.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
}
