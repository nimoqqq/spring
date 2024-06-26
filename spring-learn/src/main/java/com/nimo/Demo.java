package com.nimo;

import com.nimo.event.MyEvent;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author : chuf
 * @date : 2023-05-06
 **/
@SuppressWarnings("all")
public class Demo {
	public static void main(String[] args) {
		getApplication();
//		getXmlBeanFactory();
//		postProcessBeanFactoryDemo();
//		testEvent();
	}

	protected static void getApplication() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.publishEvent(new MyEvent("myEvent"));
		Student student = (Student) context.getBean("student");
		System.out.println(student.getName());
	}

	protected static void testEvent() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.publishEvent(new MyEvent("myEvent"));
	}

	protected static void postProcessBeanFactoryDemo() {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getName());
	}

//	protected static void getXmlBeanFactory() {
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		Student student = (Student) xmlBeanFactory.getBean("student");
//		System.out.println(student.getName());
//	}
}
