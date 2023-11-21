package com.todo_applcation.requestDto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.todo_applcation.model.TodoList;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class TodoListRequestDTO {
	
	private String title;
	private String discription;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private String estimatedTimeCompletion;
	public TodoList convertToModel() {
		TodoList todo = new TodoList();
		BeanUtils.copyProperties(this, todo);
		return todo;
}
}
