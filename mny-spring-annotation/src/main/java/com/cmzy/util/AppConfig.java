package com.cmzy.util;

import com.cmzy.condition.LinuxCondition;
import com.cmzy.condition.WindowsCondition;
import com.cmzy.pojo.Color;
import com.cmzy.pojo.MyFactoryBean;
import com.cmzy.pojo.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Controller;

@Configuration
/**
 *ComponentScan注解用于配置扫描包，如果要使用includeFilters，
 * 必须useDefaultFilters设置为false，否者会执行默认的扫描策略
 * value：需要扫描的包
 * includeFilters：包含的扫描类，默认扫描所有，其中的过滤规则可以自己配置
 *
 */
@ComponentScan(value="com.cmzy",includeFilters = {
		@ComponentScan.Filter(type=FilterType.ANNOTATION,classes = Controller.class)
},useDefaultFilters = true)
@Conditional({
		WindowsCondition.class
})

@Import({Color.class})

public class AppConfig {

	@Bean
	/**
	 * 	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE    prototype类型,多实例
	 * 	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON     singleton类型，单实例（默认值）
	 * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST   web环境下可以为request类型   同一次请求创建一个实例
	 * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION   web环境下可以为session类型   同一个Session创建一个实例
	 */
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public User user(){
		return new User();
	}
	@Bean
	@Conditional({
			WindowsCondition.class
	})
	public User user1(){
		return new User();

	}

	@Bean
	@Conditional({
			LinuxCondition.class
	})
	public User user2(){
		return new User();

	}

	@Bean("newColor")
	public MyFactoryBean myFactoryBean(){
		return new MyFactoryBean();
	}

	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean(initMethod = "init",destroyMethod = "destory")
	public  Color color1(){
		return new Color();
	}
}
