package com.nimo.resource;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : chuf
 * @date : 2024-03-29
 **/
public class FileSystemResourceDemo {

	public static void main(String[] args) throws IOException {
		String path = "";
		Resource resource = new FileSystemResource(path);
		try (InputStream is = resource.getInputStream()) {
			// 读取和处理资源内容
			System.out.println(new String(is.readAllBytes()));
		}
	}
}
