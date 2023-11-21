package com.todo_applcation.responseDto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.todo_applcation.model.TodoList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TodoListResponseDTO {
	private Integer id;
	private String title;
	private String discription;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private String estimatedTimeCompletion;
	
	public TodoListResponseDTO(TodoList todolist) {
		BeanUtils.copyProperties(todolist, this);
	}
}
