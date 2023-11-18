package com.xworkz.festival.config;

import java.rmi.registry.Registry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.festivals")
public class BeanConfiguration implements WebMvcConfigurer{
	
	public BeanConfiguration() {
		System.out.println("Bean Config Created");
	}
	
	@Bean
	public ViewResolver viewResolve() {
		return new InternalResourceViewResolver("/" , "jsp");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Festival.jsp");
	}
	
	
	
	

}
