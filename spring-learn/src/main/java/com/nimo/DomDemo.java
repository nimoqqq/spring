package com.nimo;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : chuf
 * @date : 2024-03-07
 **/
public class DomDemo {
	public static void main(String[] args) {
		String xmlPath = "/Users/chuf/workingSoftware/spring-framework-5.2.6/spring-learn/src/main/resources/person.xml";
		List<Person> person = getPerson(xmlPath);
		System.out.println(person);
	}

	public static List<Person> getPerson(String xmlPath) {
		Document document = getDocument(xmlPath);
		List<Person> persons = new ArrayList<>();
		NodeList personNodes = document.getElementsByTagName("person");
		for (int i = 0; i < personNodes.getLength(); i++) {
			Element element = (Element) personNodes.item(i);
			Person person = new Person();
			person.setName(element.getElementsByTagName("name").item(i).getTextContent());
			person.setAge(Integer.parseInt(element.getElementsByTagName("age").item(i).getTextContent()));
			persons.add(person);
		}
		return persons;
	}

	public static Document getDocument(String xmlPath) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			return db.parse(xmlPath);
		} catch (Exception e) {
			throw new RuntimeException("文档解析失败...");
		}
	}
}
