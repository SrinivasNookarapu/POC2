package com.springboot.has_a.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication

//@EnableAutoConfiguration
//@ComponentScan
//@Configuration


public class SpringBootOrderPoc2Application implements CommandLineRunner{
	


	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrderPoc2Application.class, args);
		System.out.println("hii");
		
	}

	@Override
	public void run(String... args) throws Exception {
	
		
	}

}
