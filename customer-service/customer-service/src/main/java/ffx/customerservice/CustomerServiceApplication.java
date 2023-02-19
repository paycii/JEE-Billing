package ffx.customerservice;

import ffx.customerservice.entities.Customer;
import ffx.customerservice.repositories.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CustomerRepo customerRepo){
		return args -> {
			customerRepo.save(new Customer(null,"ss1","ss1@gmail.com"));
			customerRepo.save(new Customer(null,"ss2","ss2@gmail.com"));
		};
	}

}
