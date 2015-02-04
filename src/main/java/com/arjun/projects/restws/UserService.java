package com.arjun.projects.restws;

import java.util.ArrayList;

public class UserService {
	
	public static User getUser(int userid) {
		return MyDB.get(userid);
	}
	
	public static User addUser(User user) {
		return MyDB.insert(user);
	}
	
	public static boolean deleteUser(int userid) {
		return MyDB.delete(userid);
	}
	
	public static User updateUser(User user) {
		MyDB.delete(user.getUserid());
		return MyDB.insert(user);
	}

	public static ArrayList<User> getUsers() {
		return MyDB.getUsers();
	}
	
}
