package com.tech.custom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tech.custom.entity.User;

@Service
public class UserService {
	
	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("abc","afnsdfjh","abc@gmail.com"));
		list.add(new User("xyz","xyzsdfjh","xyz@gmail.com"));

	}
	
	public List<User> getAllUsers(){
		return this.list;
	}
	
	public User getUser(String username) {
		return this.list.stream().filter((User)->User.getUserName().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		this.addUser(user);
		return user;
	}

}
