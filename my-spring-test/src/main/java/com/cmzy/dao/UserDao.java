package com.cmzy.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class UserDao {

	public UserDao(){
		System.out.println("UserDao constructor");
	}

	public void printInfo(){
		System.out.println("user dao");
	}

	//@PostConstruct注解表示 spring bean 生命周期初始化的回调方法
	@PostConstruct
	public void test(){
		System.out.println("spring bean 生命周期初始化的回调方法");
	}
}