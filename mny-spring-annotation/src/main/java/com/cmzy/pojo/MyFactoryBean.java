package com.cmzy.pojo;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Color> {
	/**
	 * 获取的Bean的时候实际上是通过getObject方法获取
	 * @return
	 * @throws Exception
	 */
	@Override
	public Color getObject() throws Exception {
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}

	/**
	 * 是否是单例，返回true表示是单例，false表示是prototype
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
