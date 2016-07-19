package com.decathlon.commerce.service;

import com.decathlon.commerce.model.User;

import java.util.List;


public interface UserService {
	
	User findByUserid(String userid);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserByUserid(String userid);

	List<User> findAllUsers(); 
	
	boolean isUserNameUnique(String userid, String name);

}