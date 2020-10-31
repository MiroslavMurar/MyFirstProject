package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping("/admin")
public class AdminCustomerController {
	
	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping("/customers")
	public String getCustomers(Model model) {
		
		List<Customer> customers = customerService.getCustomers(); 
		
		model.addAttribute("customers", customers); 
		
		
		return "admin/admin-customers"; 
	}
	
	
	@RequestMapping("/adminShowFormForAdd")
	public String adminShowFormForAdd(Model model) {
		
		Customer customer = new Customer(); 
		
		model.addAttribute("customer", customer); 
		
		return "admin/admin-customer-form"; 
	}
	
	@PostMapping("/adminSaveCustomer")
	public String adminSaveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "admin-customer-form"; 
		} else { 
			customerService.saveCustomer(customer);
			return "admin/admin-customer-confirmation"; 
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model ) {
		
		Customer customer = customerService.getCustomer(id); 
		
		model.addAttribute("customer", customer); 
		
		return "admin/admin-customer-form"; 
		
	}
	
	@GetMapping("/adminDelete")
	public String adminDelete(@RequestParam("customerId") int id) {
		
		customerService.deleteCustomer(id);
		
		return "redirect:/admin/customers"; 
	}
	
}
