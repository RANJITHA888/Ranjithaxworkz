package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springXml = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(springXml);
		Chocolate chocolate = container.getBean(Chocolate.class);
		//chocolate.setName("kitkat");
		//chocolate.setPrice(50);
		//chocolate.setSize("medium");
		//chocolate.setBrand("cadberry");
		chocolate.tasty();
		chocolate.stressReliver();
		System.out.println(chocolate);
	

	}

}
