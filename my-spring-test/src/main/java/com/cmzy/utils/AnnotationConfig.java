package com.cmzy.utils;

import com.cmzy.pojo.Person;
import com.cmzy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cmzy")
/**
 * 开启AOP功能，其实就是引入AnnotationAwareAspectJAutoProxyCreator这个类，
 * 这个类是BeanPostProcessor的实现类，用于生成spring AOP的代理类
 */
@EnableAspectJAutoProxy
public class AnnotationConfig {


}
