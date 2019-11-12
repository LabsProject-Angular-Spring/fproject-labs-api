package labsproject.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class LabsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabsApiApplication.class, args);
	}

}
