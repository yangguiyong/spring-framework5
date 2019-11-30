package com.cmzy.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cmzy")
@EnableAspectJAutoProxy
public class AnnotationConfig {
}
