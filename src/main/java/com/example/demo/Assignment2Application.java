package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) throws BeansException {
		SpringApplication.run(Assignment2Application.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext name= new ClassPathXmlApplicationContext("applicationContext.xml");
		Battery b = name.getBean("battery",Battery.class);
		b.charge();
	}
}
