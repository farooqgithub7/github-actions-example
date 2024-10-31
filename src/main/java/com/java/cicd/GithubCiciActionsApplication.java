package com.java.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiciActionsApplication {

	@GetMapping("/welcome")
	public String welcome()
	{
		return  "welcome to java devlopment";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubCiciActionsApplication.class, args);
	}

}
