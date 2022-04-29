package com.vaishali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaishali.dao.UserDaoI;
import com.vaishali.model.User;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserDaoI userdaoI;
	
	@Override
	public int SaveUserService(User user) {
		int id=userdaoI.SaveUserDao(user);
		return id;
	}

	@Override
	public List<User> loginCheckService(User user) {
		List<User> list=userdaoI.loginCheckdaoI(user);
		return list;
	}

}
