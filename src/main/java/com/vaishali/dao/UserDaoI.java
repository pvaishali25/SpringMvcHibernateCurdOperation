package com.vaishali.dao;

import java.util.List;

import com.vaishali.model.User;

public interface UserDaoI {

	public int SaveUserDao(User user);

	public List<User> loginCheckdaoI( User user);
		
	

}
