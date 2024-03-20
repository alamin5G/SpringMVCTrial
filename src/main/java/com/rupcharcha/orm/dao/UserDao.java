package com.rupcharcha.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rupcharcha.orm.entity.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int save(User user) {
		int i = (int) hibernateTemplate.save(user);
		return i;
	}
}
