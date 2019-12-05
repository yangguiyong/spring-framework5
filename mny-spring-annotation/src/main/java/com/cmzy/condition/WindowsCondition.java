package com.cmzy.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//获取BeanFactory
		ConfigurableListableBeanFactory configurableListableBeanFactory = context.getBeanFactory();
		//获取系统环境
		Environment environment = context.getEnvironment();
		//获取BeanDefinitionRegister，里面存放了BeanDefinition
		BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();
		String osName = environment.getProperty("os.name");
		System.out.println(osName);
		if(osName.contains("Windows")){
			return true;
		}
		return false;
	}
}
