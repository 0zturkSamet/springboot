package springboot_kurs_controller_service_repository_form_based_authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@SpringBootApplication

public class SpringbootKursApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKursApplication.class, args);
	//Spring Boot created all that we need
	//Don't touch it this place
	}

}
