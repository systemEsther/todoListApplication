package com.todo_applcation.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.todo_applcation.model.User;
import com.todo_applcation.repository.UserListRepository;
import com.todo_applcation.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	 private final UserRepository userRepository;

	    public CustomUserDetailsService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        User user = userRepository.findUserByEmail(email);
	        List<String> roles = new ArrayList<>();
	        roles.add("USER");
	        UserDetails userDetails =
	                org.springframework.security.core.userdetails.User.builder()
	                        .username(user.getEmail())
	                        .password(user.getPassword())
	                        .roles(roles.toArray(new String[0]))
	                        .build();
	        return userDetails;
	    }
}
