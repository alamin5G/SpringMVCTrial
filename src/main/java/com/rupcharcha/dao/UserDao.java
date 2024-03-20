package com.rupcharcha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rupcharcha.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveuser(User user) {
		String sql = "INSERT INTO user(name, email, password) VALUES (?, ?, ?)";
		int i = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword());
		return i;
	}
}
