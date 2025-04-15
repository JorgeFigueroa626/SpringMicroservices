package posApiConfigServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PosApiConfigServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApiConfigServeApplication.class, args);
	}

}
