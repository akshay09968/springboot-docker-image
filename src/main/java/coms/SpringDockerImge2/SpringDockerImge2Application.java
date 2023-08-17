package coms.SpringDockerImge2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringDockerImge2Application {

	@GetMapping("/p1")
	public String FirstPage() {
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerImge2Application.class, args);
		System.out.println("hello......");
	}

}
