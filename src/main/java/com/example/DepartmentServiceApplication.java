package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {
	String s="";

	public static void main(String[] args) {
		System.out.println("Spring boot main file");
		//changes for HLS-132
		SpringApplication.run(DepartmentServiceApplication.class, args);
		//changes done here
	}

}
