package com.nimo.factoryBean;

import com.nimo.Student;
import org.springframework.beans.factory.FactoryBean;

public class StudentFactory implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		System.out.println("通过FactoryBean创建Student");
		Student student = new Student();
		student.setName("aaa");
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
