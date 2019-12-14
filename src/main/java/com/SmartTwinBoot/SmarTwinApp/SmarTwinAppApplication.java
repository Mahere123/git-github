package com.SmartTwinBoot.SmarTwinApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmarTwinAppApplication extends SpringBootServletInitializer {
	   
	   public static void main(String[] args) {
		 SpringApplication.run(SmarTwinAppApplication.class, args);
	   }
	  
	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SmarTwinAppApplication.class);
	   }
	
}
