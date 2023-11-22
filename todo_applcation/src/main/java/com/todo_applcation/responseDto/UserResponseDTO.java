package com.todo_applcation.responseDto;

import org.springframework.beans.BeanUtils;

import com.todo_applcation.model.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponseDTO {
	private Integer id;
	private String firstName;
	private String lastName;
	private String password;
	private String status;
	private String email;
	private String role;
	public UserResponseDTO(User user) {
		BeanUtils.copyProperties(user, this);
	}
}
