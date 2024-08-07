package cok.hour.gatwayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwayServiceApplication.class, args);
	}


	// @Bean
	// public RouteLocator myRoutesLocator(RouteLocatorBuilder routeBuilder){

	// 	return routeBuilder.routes()
	// 	.route(p -> p
	// 	.path("/customers")
	// 	.filters(f -> f.prefixPath("/api"))
	// 	.uri("http://localhost:8081"))
	// 	.build() ;
	// }
	

	// to make the gateway able to looking for microservices on discovry (registertion service)
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient reactiveDiscoveryClient
	, DiscoveryLocatorProperties discoveryLocatorProperties){


		return new DiscoveryClientRouteDefinitionLocator(
							reactiveDiscoveryClient,
							discoveryLocatorProperties) ;
	}

}
