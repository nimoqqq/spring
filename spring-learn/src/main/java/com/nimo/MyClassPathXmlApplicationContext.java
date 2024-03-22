package com.nimo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : chuf
 * @date : 2024-03-22
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String location) {
		super(location);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("重写 ApplicationContext 的 postProcessBeanFactory 方法...");

		// 1. 获取容器中的 BeanDefinition
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("student");

		// 2. 修改 beanDefinition 中的信息
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}
