package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot main file");
		//changes for HLS-132
		//changes for HLS-200
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
