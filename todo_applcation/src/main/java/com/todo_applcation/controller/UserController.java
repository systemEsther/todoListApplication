package com.todo_applcation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo_applcation.requestDto.UserRequestDTO;
import com.todo_applcation.responseDto.UserResponseDTO;
import com.todo_applcation.service.UserService;

@RequestMapping("v1/user")
@RestController
public class UserController {
	
	@Autowired
	UserService userservice ;

	

	@GetMapping("/{id}")
	public ResponseEntity<UserResponseDTO> getById(@PathVariable Integer id) throws Exception{
		UserResponseDTO res=userservice.getById(id);
		return ResponseEntity.ok(res);
	}
	@PostMapping()
	public ResponseEntity<UserResponseDTO> save(@RequestBody UserRequestDTO reguest)throws Exception {
		UserResponseDTO res=userservice.save(reguest);
		return ResponseEntity.ok(res);
	}
	@PutMapping("/{id}")
	public ResponseEntity<UserResponseDTO> update(@PathVariable Integer id,@RequestBody UserRequestDTO request) throws Exception{
		UserResponseDTO res=userservice.update(id,request);
		return ResponseEntity.ok(res);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<UserResponseDTO> delete(@PathVariable Integer id)throws Exception{
		UserResponseDTO res=userservice.delete(id);
		return ResponseEntity.ok(res);
	}
	

}
