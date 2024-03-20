package com.rupcharcha.orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupcharcha.orm.dao.UserDao;
import com.rupcharcha.orm.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public int saveUser(User user) {
		int i = userDao.save(user);
		return i;
	}

}
