package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClaculatorDockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaculatorDockerImageApplication.class, args);
	}
	
	
	
	@GetMapping("/{value}/{num1}/{num2}")
	public String calculation(@PathVariable String value, @PathVariable float  num1,@PathVariable float  num2) {
		if(value.equalsIgnoreCase("add")) {
			return String.valueOf(num1+num2);
		}
		else if(value.equalsIgnoreCase("sub")) {
			return String.valueOf(num1-num2);
		}
		else if(value.equalsIgnoreCase("mul")) { 
			return String.valueOf(num1*num2);
		}
		else if(value.equalsIgnoreCase("div")) {
			return String.valueOf(num1/num2);
		}
		else {
			return "invalid operation";
		}
		
	}

}
