package com.rupcharcha.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rupcharcha.entity.User;

public class UserDao {

	private JdbcTemplate jdbcTemplate;
	public int saveuser(User user) {
		String sql = "INSERT INTO user(name, email, password) VALUES (?, ?, ?)";
		int i = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword());
		return i;
	}
}
