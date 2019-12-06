package com.cmzy.service;

import com.cmzy.utils.MyAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;


public class PersonService {


	@MyAnnotation("测试")
	public void printInfo(){
		System.out.println("PersonService 中的printInfo方法>>>>>>>");

	}
}
