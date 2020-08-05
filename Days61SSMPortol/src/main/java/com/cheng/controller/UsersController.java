package com.cheng.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cheng.pojo.Users;
import com.cheng.service.IUsersService;

@RestController
public class UsersController {

	@Resource
	private IUsersService userService;
	
	@GetMapping("/Users")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
}
