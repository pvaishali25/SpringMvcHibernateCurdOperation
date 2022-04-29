package com.vaishali.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vaishali.model.User;

@Repository
public class UserDaoImpl implements UserDaoI {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int SaveUserDao(User user) {
		Session session = sf.openSession();
		session.beginTransaction();
		int id = (int) session.save(user);
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<User> loginCheckdaoI(User user) {
		boolean flag=false;
		Session session = sf.openSession();
		Query query = session.createQuery("from User");
		List<User> list = ((org.hibernate.query.Query) query).getResultList();
		for(User user1 :list) {
if(user.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword())) {
		
           flag=true;
           break;
        }
		}
	if(flag==true) {
		return list;
	}
	return null;
	}

}
