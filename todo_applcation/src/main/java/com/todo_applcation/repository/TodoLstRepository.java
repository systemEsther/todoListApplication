package com.todo_applcation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.todo_applcation.model.TodoList;
import com.todo_applcation.requestDto.TodoListRequestDTO;



@Repository
public interface TodoLstRepository extends JpaRepository<TodoList, Integer>,JpaSpecificationExecutor<TodoList>{

	

}
