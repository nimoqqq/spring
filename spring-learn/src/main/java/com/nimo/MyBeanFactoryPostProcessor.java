package com.nimo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author : chuf
 * @date : 2024-03-22
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("覆盖 BeanFactoryPostProcessor 的 postProcessBeanFactory 方法...");
		BeanDefinition student = beanFactory.getBeanDefinition("student");
		student.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}
