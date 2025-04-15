package posApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PosApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApiGatewayApplication.class, args);
	}

}
