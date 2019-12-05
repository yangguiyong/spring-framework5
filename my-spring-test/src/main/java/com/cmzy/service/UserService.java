package com.cmzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService(){
		System.out.println("UserService Constructor.....");
	}
}
