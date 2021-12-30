package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);



		byte b = 10;
		int x = Byte.toUnsignedInt(b);
		System.out.println("Signed value in byte   = " + b);
		System.out.println("Unsigned value in  byte   = " + x);


	};




}

