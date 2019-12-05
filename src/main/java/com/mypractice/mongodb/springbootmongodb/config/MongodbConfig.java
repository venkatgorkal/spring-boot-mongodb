package com.mypractice.mongodb.springbootmongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mypractice.mongodb.springbootmongodb.document.User;
import com.mypractice.mongodb.springbootmongodb.repository.UserRepository;
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongodbConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return strings -> {
			userRepository.save(new User(123, "admin", 33, "IT"));
			userRepository.save(new User(456, "supervisior", 33, "Electronics"));
		};
		
	}

}
