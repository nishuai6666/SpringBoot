package com.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.common.RedisUtil;
import com.springboot.example.dao.UserDao;
import com.springboot.example.dto.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;//注入UserDao
	
	public User selectUserByName(String userName) {
		//RedisUtil redisUtil = new RedisUtil();
		return userDao.selectUserByUserName(userName);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
