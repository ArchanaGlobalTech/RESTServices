package org.archanasweets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringRESTApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRESTApiApplication.class, args);
	}
}
