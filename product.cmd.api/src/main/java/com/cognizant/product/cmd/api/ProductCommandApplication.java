package com.cognizant.product.cmd.api;

import com.cognizant.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ AxonConfig.class })
public class ProductCommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCommandApplication.class, args);
	}

}
