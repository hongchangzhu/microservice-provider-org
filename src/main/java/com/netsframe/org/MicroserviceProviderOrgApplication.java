package com.netsframe.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
// @EnableHystrix
public class MicroserviceProviderOrgApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderOrgApplication.class, args);
	}
}