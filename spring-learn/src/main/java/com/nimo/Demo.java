package com.nimo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : chuf
 * @date : 2023-05-06
 **/
@SuppressWarnings("all")
public class Demo {
	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Student student = (Student) xmlBeanFactory.getBean("student");
		System.out.println(student.getName());
	}
}
