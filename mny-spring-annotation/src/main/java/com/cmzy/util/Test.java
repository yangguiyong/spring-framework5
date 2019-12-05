package com.cmzy.util;

import com.cmzy.pojo.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		ac.getBean(Car.class);

	}
}