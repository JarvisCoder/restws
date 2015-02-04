package com.arjun.projects.restws;

import java.util.ArrayList;
import java.util.HashMap;

public class MyDB {

	private static HashMap<Integer, User> DB = new HashMap<Integer, User>();

	public static User insert(User u) {
		if(DB.containsKey(u.getUserid()))
			return null;
		
		DB.put(u.getUserid(), u);
		return DB.get(u.getUserid());
	}
	
	public static User get(int k) {
		if(DB.containsKey(k)) 
			return DB.get(k);
		else
			return null;
	}
	
	public static boolean delete(int k) {
		if(DB.containsKey(k)) {
			DB.remove(k);
			return true;
		}
		else
			return false;
	}
	
	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for( Integer k : DB.keySet() ) 
			users.add(DB.get(k));
		return users;
	}
	
}
