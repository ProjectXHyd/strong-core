package com.x.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.x.api.dao.UserDao;
import com.x.api.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	Gson gson = new Gson();
	
	public String getAllUserList() {
		String userListJson = "";
		List<User> users = (List<User>) userDao.findAll();
		userListJson = gson.toJson(users);
		return userListJson;
	}
	
}
