package com.demo.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.demo.tictactoe")
public class TictactoeApplication {
	public static void main(String[] args) {
		SpringApplication.run(TictactoeApplication.class, args);
	}
}
