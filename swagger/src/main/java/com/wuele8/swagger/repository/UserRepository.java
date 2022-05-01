package com.wuele8.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.wuele8.swagger.model.User;


public interface UserRepository 
extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
	@Query(value="select * from users", nativeQuery = true)
	public List<User> getUserByName();
	
}