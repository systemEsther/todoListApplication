package com.todo_applcation.service;

import java.util.List;

import com.todo_applcation.requestDto.TodoListRequestDTO;
import com.todo_applcation.responseDto.TodoListResponseDTO;

public interface TodoListService   {

	List<TodoListResponseDTO> getAll() throws Exception;

	TodoListResponseDTO getById(Integer id)throws Exception;

	TodoListResponseDTO save(TodoListRequestDTO reguest)throws Exception;

	TodoListResponseDTO update(Integer id,TodoListRequestDTO request)throws Exception;

	TodoListResponseDTO delete(Integer id)throws Exception;

}
