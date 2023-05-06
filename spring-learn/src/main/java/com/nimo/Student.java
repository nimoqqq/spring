package com.nimo;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author : chuf
 * @date : 2023-05-05
 **/
public class Student implements BeanNameAware {

	private String name = "nimo";


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("beanName: " + name);
	}
}
