package com.todo_applcation.service;

import com.todo_applcation.requestDto.UserRequestDTO;
import com.todo_applcation.responseDto.UserResponseDTO;

public interface UserService {

	UserResponseDTO save(UserRequestDTO reguest)throws Exception;

	UserResponseDTO getById(Integer id)throws Exception;

	UserResponseDTO update(Integer id, UserRequestDTO request)throws Exception;

	UserResponseDTO delete(Integer id)throws Exception;

	

}
