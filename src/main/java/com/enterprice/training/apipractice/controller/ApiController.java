package com.enterprice.training.apipractice.controller;

import java.util.ArrayList;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.training.apipractice.model.Costumers;



@RestController
@RequestMapping("/api")
public class ApiController {
	
	@RequestMapping(value="/costumers", method = RequestMethod.GET)
	public ArrayList<Costumers> obtenerPersona(HttpServletRequest request) {
		
		/*Costumers client = new Costumers();
		client.setFirstname("Alberto");
		client.setLastname("Rios");
		client.setId("5-683-828");
		client.setAccount("04-4545667334");
		client.setAccountType("AHORROS");
		client.setBalance(new BigDecimal(300));*/
		
		

		
		ArrayList <Costumers> client = new ArrayList<>();
		 	client.add(new Costumers("Alberto","Rios","5-683-828","04-4545667334","Ahorros",new BigDecimal(300)));
		 	client.add(new Costumers("Maria","Sandoval","8-935-254","04-35576678","Ahorros",new BigDecimal(1000)));
		 	
		
		 	return client;

		
		
	}
		
	
}
