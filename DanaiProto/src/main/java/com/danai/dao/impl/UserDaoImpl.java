package com.danai.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.danai.dao.UserDao;
import com.danai.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Transactional
	public void add(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(user);

	}

	@Transactional
	public void edit(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(user);

	}

	@Transactional
	public void delete(int userId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getUser(userId));

	}

	@Transactional
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return (User)session.getCurrentSession().get(User.class, userId);
	}

	@Transactional
	public List getAllUser() {
		// TODO Auto-generated method stub	
		return session.getCurrentSession().createQuery("from User").list();
	}

}
