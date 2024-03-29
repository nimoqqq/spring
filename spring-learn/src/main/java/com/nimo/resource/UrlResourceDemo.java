package com.nimo.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;

/**
 * @author : chuf
 * @date : 2024-03-29
 **/
public class UrlResourceDemo {

	public static void main(String[] args) throws Exception {
		Resource resource = new UrlResource("");
		try (InputStream is = resource.getInputStream()) {
			// 读取和处理资源内容
			System.out.println(new String(is.readAllBytes()));
		}
	}
}
