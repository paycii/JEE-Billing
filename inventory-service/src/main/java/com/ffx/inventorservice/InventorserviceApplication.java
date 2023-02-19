package com.ffx.inventorservice;

import com.ffx.inventorservice.entities.Product;
import com.ffx.inventorservice.repositories.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventorserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepo productRepo){
		return args -> {
			productRepo.save(new Product(null,"Ordi",7878,12));
			productRepo.save(new Product(null,"Imprimant",4788,12));
			productRepo.save(new Product(null,"Phone",7880,12));
			productRepo.findAll().forEach(p->{System.out.println(p.toString());});
		};
	}




}

