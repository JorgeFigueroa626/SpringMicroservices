package posApiStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PosApiStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApiStudentApplication.class, args);
	}

}
