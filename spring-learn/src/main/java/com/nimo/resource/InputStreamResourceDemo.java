package com.nimo.resource;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author : chuf
 * @date : 2024-03-29
 **/
public class InputStreamResourceDemo {
	public static void main(String[] args) throws Exception {
		InputStream isSource = new ByteArrayInputStream("hello world".getBytes());
		Resource resource = new InputStreamResource(isSource);
		try (InputStream is = resource.getInputStream()) {
			// 读取和处理资源内容
			System.out.println(new String(is.readAllBytes()));
		}
	}
}
