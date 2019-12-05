package com.mypractice.mongodb.springbootmongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
	private Integer userId;
	private String userName;
	private Integer age;
	private String department;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public User(Integer userId, String userName, Integer age, String department) {

		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.department = department;
	}
	

}
