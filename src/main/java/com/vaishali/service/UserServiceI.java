package com.vaishali.service;

import java.util.List;

import com.vaishali.model.User;

public interface UserServiceI {
	
	public int SaveUserService(User user);
	
	public List<User> loginCheckService(User user);

}
