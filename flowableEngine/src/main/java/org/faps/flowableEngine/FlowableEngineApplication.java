package org.faps.flowableEngine;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(proxyBeanMethods = false)
public class FlowableEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableEngineApplication.class, args);
    }

    
    
    @Bean 
    public WebMvcConfigurer corsConfigurer() {
    	System.out.println("Enabling CORS");
    	return new WebMvcConfigurer() {
    		
    		@Override
    		public void addCorsMappings(CorsRegistry registry) {
    			registry.addMapping("/**").allowedOrigins("*");
    		}
		};
    }
}

