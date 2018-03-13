package com.x.api.controller;

import com.x.api.dto.UserDto;
import com.x.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import javax.validation.ValidationException;

@Controller
public class AuthController {

    @Autowired
    AuthService authService;

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.CREATED)
    public void registerUser(@Valid UserDto userDto) {

        try{
            authService.registerUser(userDto);
        }catch (Exception e){
            throw new ValidationException(e);
        }

    }
}
