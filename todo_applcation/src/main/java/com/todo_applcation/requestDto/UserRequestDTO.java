package com.todo_applcation.requestDto;

import org.springframework.beans.BeanUtils;

import com.todo_applcation.model.TodoList;
import com.todo_applcation.model.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDTO {
	private String userName;
	private String password;
	private String status;
	public User convertToModel() {
		User user = new User();
		BeanUtils.copyProperties(this, user);
		return user;
}

}
