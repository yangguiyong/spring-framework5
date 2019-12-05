package com.cmzy.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AwareTest implements BeanFactoryAware, ApplicationContextAware {

	private String name;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		Car car = (Car)beanFactory.getBean("car");
		System.out.println(car.toString());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		applicationContext.getEnvironment()
	}
}
