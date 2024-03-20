package com.rupcharcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupcharcha.dao.UserDao;
import com.rupcharcha.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public int registerUser(User user) {
		int i = userDao.saveuser(user);
		return i;
	}

}
