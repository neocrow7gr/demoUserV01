package com.example.demoUser.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoUser.dto.User;
import com.example.demoUser.service.UserService;

@RestController
public class UserApi {
	
	@Autowired
	UserService userService;
	 
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User updateOrSave(@RequestBody User user){
	    return userService.save(user);
	}
	
	@RequestMapping(value="/userDelete", method=RequestMethod.POST)
	public String delete(@RequestBody User user){
			userService.delete(user);
	    return "Usuario Borrado Satisfactoriamente";
	}
	
	@RequestMapping(value="/userFindById", method=RequestMethod.POST)
	public User getById(@RequestBody long id){
	    return userService.getById(id);
	}
	
	@RequestMapping(value="/userFindAll", method=RequestMethod.GET)
	public List<User> getAll(){
	    return userService.getAll();
	}
	
	
	
	
}
