package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	public ObjectMapper getObjectMapper() {
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.addMixIn(Object.class, IgnoreHibernatePropertiesInJackson.class);
	    return mapper;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private abstract class IgnoreHibernatePropertiesInJackson{ }
}
