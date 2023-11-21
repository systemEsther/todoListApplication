package com.todo_applcation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.todo_applcation.model.TodoList;
import com.todo_applcation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> ,JpaSpecificationExecutor<User>{

}
