package com.ust.springboot_docker_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJenkinsApplication.class, args);
	}

}
