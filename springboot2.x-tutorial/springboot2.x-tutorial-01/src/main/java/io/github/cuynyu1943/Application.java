package io.github.cuynyu1943;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	String index() {
		return "Hello World! Welcome to Spring Boot.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
