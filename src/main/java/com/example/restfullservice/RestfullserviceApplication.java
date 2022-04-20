package com.example.restfullservice;

import com.example.restfullservice.service.conversions.XmlToJavaConversions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;

@SpringBootApplication
public class RestfullserviceApplication implements CommandLineRunner{

	@Autowired
	com.example.restfullservice.service.conversions.JavaToXmlConversion javaToXmlConversion;

	@Autowired
	XmlToJavaConversions xmlToJavaConversions;
	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(RestfullserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		javaToXmlConversion.marshing();
		xmlToJavaConversions.unMarshling();
	}
}
