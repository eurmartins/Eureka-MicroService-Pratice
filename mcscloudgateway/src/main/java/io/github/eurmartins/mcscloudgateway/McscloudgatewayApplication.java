package io.github.eurmartins.mcscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class McscloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(McscloudgatewayApplication.class, args);
	}

	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder.routes()
				.route(r -> r.path("/client/**").uri("lb://mcsclient")).build();
	}
}
