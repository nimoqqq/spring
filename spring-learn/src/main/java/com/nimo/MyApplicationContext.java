package com.nimo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : chuf
 * @date : 2023-08-04
 **/
public class MyApplicationContext extends ClassPathXmlApplicationContext {

	public MyApplicationContext(String location) {
		super(location);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("重写 ApplicationContext 的 postProcessBeanFactory 方法...");
		super.postProcessBeanFactory(beanFactory);
	}
}
