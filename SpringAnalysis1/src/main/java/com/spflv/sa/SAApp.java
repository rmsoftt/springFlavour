package com.spflv.sa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SAApp {
	
	static{
		
		System.setProperty("currenttime",LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}

	public static void main(String[] args) {
		SpringApplication.run(SAApp.class, args);
		
		
	}
}
