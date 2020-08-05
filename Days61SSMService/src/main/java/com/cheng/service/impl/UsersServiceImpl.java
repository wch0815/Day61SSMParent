package com.cheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cheng.dao.IUsersDao;
import com.cheng.pojo.Users;
import com.cheng.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {

	@Resource
	private IUsersDao userDao;
	
	@Override
	public List<Users> getAllUsers() {

		return userDao.getAllUsers();
	}

}
