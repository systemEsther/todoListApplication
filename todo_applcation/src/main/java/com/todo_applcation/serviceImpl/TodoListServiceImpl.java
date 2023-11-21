package com.todo_applcation.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.todo_applcation.exception.ResourceNotFoundException;
import com.todo_applcation.model.TodoList;
import com.todo_applcation.repository.TodoLstRepository;
import com.todo_applcation.requestDto.TodoListRequestDTO;
import com.todo_applcation.responseDto.TodoListResponseDTO;
import com.todo_applcation.service.TodoListService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TodoListServiceImpl implements TodoListService {
	@Autowired
	TodoLstRepository todoListRepo;
	@Autowired
	ObjectMapper objectMapper;

	@Override
	public List<TodoListResponseDTO> getAll() throws Exception {
		return todoListRepo.findAll().stream().map(TodoListResponseDTO::new).toList();
	}

	@Override
	public TodoListResponseDTO getById(Integer id) throws Exception {
		Optional<TodoList> todo = todoListRepo.findById(id);
		if (todo.isPresent()) {
			return new TodoListResponseDTO(todo.get());
		} else {
			throw new ResourceNotFoundException("id not found");
		}
	}

	@Override
	public TodoListResponseDTO update(Integer id, TodoListRequestDTO request) throws Exception {
		log.info("enter into the update api");
		Optional<TodoList> todo = todoListRepo.findById(id);

		if (todo.isPresent()) {
			TodoList todoList = objectMapper.convertValue(request, TodoList.class);
			todoList.setId(id);
			TodoList updatedTodoList = todoListRepo.save(todoList);
			log.info("updated succeffully");
			return new TodoListResponseDTO(updatedTodoList);

		} else {
			log.info("given id is not found");
			throw new ResourceNotFoundException("id not found");
		}
	}

	@Override
	public TodoListResponseDTO delete(Integer id) throws Exception {
		log.info("enter into the delete api");
		Optional<TodoList> todo = todoListRepo.findById(id);
		TodoListResponseDTO res = objectMapper.convertValue(todo, TodoListResponseDTO.class);
		if (!ObjectUtils.isEmpty(todo)) {
			todoListRepo.deleteById(id);
			log.info("data deleted by given id");

		} else {
			log.info("given id is not found");
			throw new ResourceNotFoundException("id not found");
		}
		return res;
	}

	@Override
	public TodoListResponseDTO save(TodoListRequestDTO reguest) throws Exception {
		log.info("enter into the save api");
		TodoList todoLi = objectMapper.convertValue(reguest, TodoList.class);
		TodoList todo = todoListRepo.save(todoLi);
		log.info("data is saved sucessfully");
		return new TodoListResponseDTO(todo);

	}

}
