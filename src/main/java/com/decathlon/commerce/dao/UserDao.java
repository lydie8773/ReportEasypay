package com.decathlon.commerce.dao;

import com.decathlon.commerce.model.User;

import java.util.List;


public interface UserDao {

	User findByUserid(String userid);
	
	User findByName(String name);
	
	void save(User user);
	
	void deleteByUserid(String userid);
	
	List<User> findAllUsers();

}

