package brokerDealer.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(
	basePackages= {
		"seleniumWebDriver.entities"
	}
)
@EnableJpaRepositories(
	basePackages= {
		"brokerDealer.repositories"
	}
)
public class SpringBootWebApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
	
}