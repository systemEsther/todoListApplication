package com.todo_applcation.requestDto;

import org.springframework.beans.BeanUtils;

import com.todo_applcation.model.TodoList;
import com.todo_applcation.model.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDTO {
	private String firstName;
	private String lastName;
	private String password;
	private String status;
	private String email;
	private String role;
	public User convertToModel() {
		User user = new User();
		BeanUtils.copyProperties(this, user);
		return user;
}

}
