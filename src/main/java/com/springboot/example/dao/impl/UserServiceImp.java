package com.springboot.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.example.dao.UserDao;
import com.springboot.example.dto.User;

public class UserServiceImp implements UserDao {
	
	@Autowired
	private UserDao userDao;//注入UserDao
	
	
	@Override
	public User selectUserByUserName(String userName) {
		return userDao.selectUserByUserName(userName);
	}

}
