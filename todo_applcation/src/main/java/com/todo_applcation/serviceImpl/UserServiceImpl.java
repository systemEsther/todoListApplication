package com.todo_applcation.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.todo_applcation.exception.ResourceNotFoundException;
import com.todo_applcation.model.User;
import com.todo_applcation.repository.UserListRepository;
import com.todo_applcation.requestDto.UserRequestDTO;
import com.todo_applcation.responseDto.UserResponseDTO;
import com.todo_applcation.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	@Autowired
	UserListRepository userRepository;
	@Autowired
	ObjectMapper objMapper;

	@Override
	public UserResponseDTO save(UserRequestDTO reguest) throws Exception {
		log.info("enter into the save api");
		User user = objMapper.convertValue(reguest, User.class);
		User savedUser = userRepository.save(user);
		log.info("data is saved sucessfully");
		return new UserResponseDTO(savedUser);

	}

	@Override
	public UserResponseDTO getById(Integer id) throws Exception {
		log.info("enter into the save api");
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			log.info("enter into the save api");
			return new UserResponseDTO(user.get());
		} else {
			log.info("id not found");
			throw new ResourceNotFoundException("id not found");
		}
	}

	@Override
	public UserResponseDTO update(Integer id, UserRequestDTO request) throws Exception {
		log.info("enter into the update api");
		Optional<User> user = userRepository.findById(id);

		if (user.isPresent()) {
			User userUpdated = objMapper.convertValue(request, User.class);
			userUpdated.setId(id);
			userRepository.save(userUpdated);
			log.info("updated succeffully");
			return new UserResponseDTO(userUpdated);

		} else {
			log.info("given id is not found");
			throw new ResourceNotFoundException("id not found");
		}

	}

	@Override
	public UserResponseDTO delete(Integer id) throws Exception {
		log.info("enter into the delete api");
		Optional<User> user = userRepository.findById(id);
		UserResponseDTO res = objMapper.convertValue(user, UserResponseDTO.class);
		if (!ObjectUtils.isEmpty(user)) {
			userRepository.deleteById(id);
			log.info("data deleted by given id");

		} else {
			log.info("given id is not found");
			throw new ResourceNotFoundException("id not found");
		}
		return res;
	}
	
}
