package com.todo_applcation.controller;

import java.util.List;

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

import com.todo_applcation.requestDto.TodoListRequestDTO;
import com.todo_applcation.responseDto.TodoListResponseDTO;
import com.todo_applcation.service.TodoListService;

@RestController
@RequestMapping("v1/todo")
public class todoListController {
	@Autowired
	TodoListService todoservice;

	@GetMapping()
	public ResponseEntity<List<TodoListResponseDTO>> getAll() throws Exception {
		List<TodoListResponseDTO> lists = todoservice.getAll();
		return ResponseEntity.ok(lists);
	}

	@GetMapping("/{id}")
	public ResponseEntity<TodoListResponseDTO> getById(@PathVariable Integer id) throws Exception {
		TodoListResponseDTO res = todoservice.getById(id);
		return ResponseEntity.ok(res);
	}

	@PostMapping()
	public ResponseEntity<TodoListResponseDTO> save(@RequestBody TodoListRequestDTO reguest) throws Exception {
		TodoListResponseDTO res = todoservice.save(reguest);
		return ResponseEntity.ok(res);
	}

	@PutMapping("/{id}")
	public ResponseEntity<TodoListResponseDTO> update(@PathVariable Integer id, @RequestBody TodoListRequestDTO request)
			throws Exception {
		TodoListResponseDTO res = todoservice.update(id, request);
		return ResponseEntity.ok(res);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<TodoListResponseDTO> delete(@PathVariable Integer id) throws Exception {
		TodoListResponseDTO res = todoservice.delete(id);
		return ResponseEntity.ok(res);
	}

}
