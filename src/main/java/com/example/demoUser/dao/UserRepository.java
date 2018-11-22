package com.example.demoUser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoUser.dto.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
