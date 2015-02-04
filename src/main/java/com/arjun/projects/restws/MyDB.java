package com.arjun.projects.restws;

import java.util.ArrayList;
import java.util.HashMap;

public class MyDB {

	private static HashMap<Integer, User> DB = new HashMap<Integer, User>();

	public static User insert(User u) {
		DB.put(u.getUserid(), u);
		return DB.get(u.getUserid());
	}
	
	public static User get(int k) {
		return DB.get(k);
	}
	
	public static void delete(int k) {
		DB.remove(get(k));
	}
	
	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for( Integer k : DB.keySet() ) 
			users.add(DB.get(k));
		return users;
	}
	
//	private void mockUsers() {
//		String name="user";
//		int age=20;
//		String email="@default.com";
//		String password="defaultpwd_";
//		
//		for(int i=1;i<=10;i++) {
//			User commonUser = new User();
//			commonUser.setAge(age + i);
//			commonUser.setEmail(i + email);
//			commonUser.setName(name + i);
//			commonUser.setPassword(password + i);
//			commonUser.setUserid(i);
//			DB.put(commonUser.getUserid(),commonUser);
//		}
//	}
	
}
