package com.example.demoUser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoUser.dao.UserRepository;
import com.example.demoUser.dto.User;

@Service
public class UserService {

	@Autowired
    UserRepository dao;
	
	
	 public User save(User user){
	        return dao.saveAndFlush(user);
	 }
	 public void delete(User user){
			dao.delete(user);
	 }
	 public List<User> getAll(){
		 return dao.findAll();
	 }
	 
	 public User getById(long id){
			return dao.getOne(id);
	 }
	
}
