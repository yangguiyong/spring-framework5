package com.cmzy.test;

import com.cmzy.dao.UserDao;
import com.cmzy.service.IndexService;
import com.cmzy.service.PersonService;
import com.cmzy.service.UserService;
import com.cmzy.utils.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new
				AnnotationConfigApplicationContext(AnnotationConfig.class);
		//UserDao userDao=(UserDao) ac.getBean("userDao");
		//userDao.printInfo();
		/*System.out.println(ac.getBean(UserService.class));*/
		PersonService personService = (PersonService)ac.getBean("personService");
		personService.printInfo();
		System.out.println("=========================");

		for (String name:ac.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}