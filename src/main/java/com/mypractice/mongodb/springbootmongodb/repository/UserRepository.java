package com.mypractice.mongodb.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mypractice.mongodb.springbootmongodb.document.User;

public interface UserRepository extends MongoRepository<User, Integer>{

	
}
