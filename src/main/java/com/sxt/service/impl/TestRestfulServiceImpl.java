package com.sxt.service.impl;

import org.springframework.stereotype.Service;

import com.sxt.service.TestRestfulService;

@Service
public class TestRestfulServiceImpl implements TestRestfulService {

	public String queryUserById(Long id) {
		System.out.println("queryUserById : " + id);
		return "{id:" + id + ", name:admin}";
	}

	public void saveUser(String user) {
		System.out.println("saveUser : " + user);
	}

	public void updateUser(String user) {
		System.out.println("updateUser : " + user);
	}

	public void deleteUserById(Long id) {
		System.out.println("deleteUserById : " + id);
	}

}
