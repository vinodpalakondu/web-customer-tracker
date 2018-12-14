package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/list")
	public String listcustomer(Model theModel)
	{
		//get customer details from service
		List<Customer> thecustomer= customerService.getCustomers();
		//add customer to the model
		theModel.addAttribute("customers", thecustomer);
		return "list-customers";
	}

}
