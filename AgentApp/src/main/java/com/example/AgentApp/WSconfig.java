package com.example.AgentApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class WSconfig {

	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		
		marshaller.setContextPath("sema.wsdl");
		return marshaller;
	}
	
	@Bean
	public WSclient Client(Jaxb2Marshaller marshaller) {
		
		
		WSclient client = new WSclient();
		client.setDefaultUri("http://localhost:9100/ws");
		client.setMarshaller(marshaller); 
		client.setUnmarshaller(marshaller);
		 
		return client;
	}
	
	
}
