package com.ofss;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CustomerController {
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		Customer c1=new Customer("Guru", "Murthy", 9731801675L, "java.guru@yahoo.com");
		Customer c2=new Customer("John", "Britto", 8351801675L, "john.britto@yahoo.com");
		Customer c3=new Customer("Odessa", "Lisburg", 7343480165L, "odessa.lisburg@oracle.com");
		Customer c4=new Customer("Nanditha", "Kumar", 9731829295L, "knanditha@yahoo.com");
		Customer c5=new Customer("Nital", "Shah", 9731801675L, "nital.shah@gmail.com");
		
		List<Customer> allCustomers=Arrays.asList(c1,c2,c3,c4,c5);
		return allCustomers;
				
		
	}

}