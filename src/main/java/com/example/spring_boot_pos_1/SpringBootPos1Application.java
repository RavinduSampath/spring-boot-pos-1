package com.example.spring_boot_pos_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootPos1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPos1Application.class, args);
	}

}
