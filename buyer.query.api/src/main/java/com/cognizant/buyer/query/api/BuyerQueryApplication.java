package com.cognizant.buyer.query.api;

import com.cognizant.user.core.configuration.AuctionMessageQueueConfig;
import com.cognizant.user.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Import({ AxonConfig.class, AuctionMessageQueueConfig.class})
public class BuyerQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerQueryApplication.class, args);
	}

/*	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
						.allowedOrigins("*");
*//*						.allowedOrigins("http://localhost:3000",
								"https://profile-front.herokuapp.com/",
								"https://gb6hd.csb.app/");*//*
			}
		};
	}*/

}
