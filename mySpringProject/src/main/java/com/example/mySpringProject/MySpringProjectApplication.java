package com.example.mySpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class MySpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringProjectApplication.class, args);
		System.out.println("The Server is started msg will display on terminal");
	}

	// @RequestMapping("/first")
	// public String sayHello(){
	// 	return "Hello will display on browser with /first API";
	// }
	// @RequestMapping("/second")
	// public String sayHelloWorld(){
	// 	return "HelloWorld";
	// }

}
