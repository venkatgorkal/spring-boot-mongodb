package com.mypractice.mongodb.springbootmongodb.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypractice.mongodb.springbootmongodb.document.User;
import com.mypractice.mongodb.springbootmongodb.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	private UserRepository userRepository;
	public UserResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
