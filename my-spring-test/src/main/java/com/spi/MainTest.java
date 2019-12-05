package com.spi;

import java.util.ServiceLoader;

/**
 * SPI机制
 * 1、当服务提供者提供了接口的一种具体实现后，在工程的META-INF/services目录下创建一个以“接口权限定名”为名的文件，里面内容为其实现类
 * 2、接口实现类在工程的classpath中
 * 3、主城需通过java.util.ServiceLoader动态装在实现模块，它会去扫描META-INF/services下文件中的实现类
 * 4、SPI的实现类必须携带一个不带参数的构造方法
 */

public class MainTest {
	public static ServiceLoader<IParse> loader = ServiceLoader.load(IParse.class);

	public static void main(String[] args) {
		for (IParse parse:loader) {
			parse.parse();
		}
	}
}
