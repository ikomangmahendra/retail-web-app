package com.angjaya.retail;

import com.angjaya.retail.domain.Product;
import com.angjaya.retail.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class RetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailApplication.class, args);
	}

    @Bean
    public CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
            // productRepository.deleteAll();

            Product smartphone = new Product();
            smartphone.setName("iPhone Pro Max");
            smartphone.setPrice(BigDecimal.valueOf(10.45));

            Product laptop = new Product();
            laptop.setName("Lenovo Laptop");
            laptop.setPrice(BigDecimal.valueOf(100.45));

            productRepository.save(smartphone);
            productRepository.save(laptop);
        };
    }
}
