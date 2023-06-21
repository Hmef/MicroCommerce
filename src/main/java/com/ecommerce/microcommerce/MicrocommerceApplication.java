package com.ecommerce.microcommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicrocommerceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MicrocommerceApplication.class, args);
		
		//System.out.println("Hello world");
	}
	
	@Override  
	public void run(String... args) throws Exception {
		
		//System.out.println(" Test run method ");
		
		
	}

}
