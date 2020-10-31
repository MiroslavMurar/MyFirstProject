package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping("/list")
	public String customerList() {
		
		return "customer-list"; 
	}
	
	@RequestMapping("/createCustomer")
	public String createCustomer(Model model) {
		
		Customer customer = new Customer(); 
		
		model.addAttribute("customer", customer); 
		
		return "customer-create"; 
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult ) {
		
		if(bindingResult.hasErrors()) {
			return "customer-create"; 
		} else {
			customerService.saveCustomer(customer); 
			
			return "customer-confirmation"; 
		}
	}
}
