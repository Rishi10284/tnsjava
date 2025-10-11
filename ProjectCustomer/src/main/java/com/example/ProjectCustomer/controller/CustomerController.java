package com.example.ProjectCustomer.controller;


import com.example.ProjectCustomer.Entity.Customer;
import com.example.ProjectCustomer.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;
	
	 @GetMapping
	    public List<Customer> getAllCustomers() {
	        return customerService.getAllCustomers();
	    }
	 
	 @GetMapping("/{id}")
	    public Customer getCustomerById(@PathVariable int id) {
	        return customerService.getCustomerById(id)
	                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
	    }
	 
	 @PostMapping
	    public Customer addCustomer(@RequestBody Customer customer) {
	        return customerService.addCustomer(customer);
	    }
	 
	 @PutMapping("/{id}")
	    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
	        return customerService.updateCustomer(id, customer);
	    }
	 
	 @DeleteMapping("/{id}")
	    public String deleteCustomer(@PathVariable int id) {
	        customerService.deleteCustomer(id);
	        return "Customer deleted successfully!";
	    }

}
