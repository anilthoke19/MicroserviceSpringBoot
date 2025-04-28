package user.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
 

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWay1Application {
 
	
	// alternate for app.propertise file 
//	 @Bean
//	  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//	  return builder.routes()
//	    .route("service1", r -> r.path("/Contact/**")
//	      .filters(f -> f.stripPrefix(1))
//	      .uri("lb://ContactUser"))
//	    .build();
//	  }
//	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGateWay1Application.class, args);
	}

}
 