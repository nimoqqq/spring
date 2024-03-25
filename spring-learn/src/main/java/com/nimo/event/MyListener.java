package com.nimo.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author : chuf
 * @date : 2024-03-25
 **/
public class MyListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof MyEvent) {
			((MyEvent) event).event();
		}
	}
}
