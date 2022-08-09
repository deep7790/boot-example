package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootOpenShiftProjApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java Techie";
	}

	@GetMapping("/{input}")
	public String congratz(@PathVariable String input) {
		return "Hi " + input + " your application deployed successfully.";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootOpenShiftProjApplication.class, args);
	}
}
