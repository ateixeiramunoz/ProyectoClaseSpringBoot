package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Demo application.
 */
@SpringBootApplication
@RestController
public class DemoApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * Hello main class string.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	String helloMainClass() {
		return "Main class";
	}

}
