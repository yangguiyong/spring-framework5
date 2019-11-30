package com.cmzy.service;

import com.cmzy.utils.MyAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService(){
		System.out.println("IndexService Constructor.....");
	}

	public void printInfo(){
		System.out.println("执行方法");
	}

	@MyAnnotation("自定义传入值")
	public void printMyAnnotation(){
		System.out.println("执行使用自定义注解修饰的方法");
	}
}
