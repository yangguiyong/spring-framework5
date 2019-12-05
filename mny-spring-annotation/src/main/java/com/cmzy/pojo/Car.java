package com.cmzy.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Primary
@Component
public class Car implements InitializingBean, DisposableBean {
	public Car(){
		System.out.println("Exec car constructor!!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("exec car afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {

	}

	@PostConstruct
	public void testPostConstructor(){
		System.out.println("exec postConstruct function");
	}

	@Override
	public String toString() {
		return "get car info";
	}
}
