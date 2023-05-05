package com.nimo;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : chuf
 * @date : 2023-05-05
 **/
public class BeanFactoryDemo {

	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Student student = (Student) xmlBeanFactory.getBean("student");
		System.out.println(student.getName());
	}
}
