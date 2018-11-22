package com.example.demoUser.api;


import java.util.List;

import org.dozer.Mapper;
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
	@Autowired
	Mapper mapper; 
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public UserResponse updateOrSave(@RequestBody UserRequest userRequest){
		
		// Mapeo request dto ==&amp;amp;amp;amp;amp;gt; entity
	    User User = mapper.map(userRequest, User.class);
	     
	    // Invoca lógica de negocio
	    User updatedUser = userService.save(User);
	     
	    // Mapeo entity ==&amp;amp;gt; response dto
	    UserResponse UserResponse = mapper.map(updatedUser, UserResponse.class); 
	     
	    return UserResponse;
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
