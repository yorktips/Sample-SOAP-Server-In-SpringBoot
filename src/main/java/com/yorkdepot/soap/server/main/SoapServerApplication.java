package com.yorkdepot.soap.server.main;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yorkdepot.xi.Retail.PurchaseOrder.MI_WCSOrderDetail_osImpl;

@SpringBootApplication
public class SoapServerApplication implements CommandLineRunner {

	@Value("${service.endpoint}")
	private String serviceEndpoint;

	@Override
	public void run(String... args) throws Exception {
		//http://localhost:50000/MI_WCSOrderDetail_osService/WCSOrderDetail_os
		Endpoint.publish(serviceEndpoint, new MI_WCSOrderDetail_osImpl());
	}

	public static void main(String[] args) {
		SpringApplication.run(SoapServerApplication.class, args);
	}
}
