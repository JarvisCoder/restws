package com.arjun.projects.restws;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class Controller {
	
	@RequestMapping(method= RequestMethod.POST, value = "/")
	ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User>(UserService.addUser(user), HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value = "/{userid}")
	ResponseEntity<User> updateUser(@PathVariable int userid, @RequestBody User user) {
		return new ResponseEntity<User>(UserService.updateUser(user), HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value = "/{userid}")
	ResponseEntity<User> getUser(@PathVariable int userid) {
		return new ResponseEntity<User>(UserService.getUser(userid), HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value = "/")
	ArrayList<User> getUsers() {
		ArrayList<User> userList = UserService.getUsers();
		return userList;
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value = "/{user}")
	void deleteUser(@PathVariable int user) {
		UserService.deleteUser(user);
	}
}
