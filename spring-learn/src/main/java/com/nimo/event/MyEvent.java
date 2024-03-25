package com.nimo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author : chuf
 * @date : 2024-03-25
 **/
public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}

	public void event() {
		System.out.println("自定义事件逻辑...");
	}
}
