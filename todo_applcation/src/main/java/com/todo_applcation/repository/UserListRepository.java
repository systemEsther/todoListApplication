package com.todo_applcation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.todo_applcation.model.User;

@Repository
public interface UserListRepository extends JpaRepository<User, Integer> ,JpaSpecificationExecutor<User>{
	//Optional<User> findByName(String username);
	
}
