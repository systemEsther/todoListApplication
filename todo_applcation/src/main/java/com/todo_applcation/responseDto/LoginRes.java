package com.todo_applcation.responseDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class LoginRes {
	public LoginRes(String email, String token) {
        this.email = email;
        this.token = token;
    }
	private String email;
    private String token;

}
