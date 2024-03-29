package com.nimo.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : chuf
 * @date : 2024-03-29
 **/
public class ClassPathResourceDemo {

	public static void main(String[] args) throws IOException {
		String path = "resource.properties";
		Resource resource = new ClassPathResource(path);
		try (InputStream inputStream = resource.getInputStream()) {
			System.out.println(new String(inputStream.readAllBytes()));
		}
	}
}
