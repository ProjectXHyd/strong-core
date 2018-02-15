package com.x.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.x.api.service.UserService;

@RequestMapping(value = "/users")
@Controller
public class UserContoller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	@ResponseBody
	public String getAllUsers() {
		
		return userService.getAllUserList();
	}
}
