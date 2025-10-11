package com.example.ProjectCustomer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectCustomer.Entity.Customer;
import com.example.ProjectCustomer.Repo.CustomerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	 public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }
	 public Optional<Customer> getCustomerById(int id) {
	        return customerRepository.findById(id);
	    }
	 public Customer addCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }
	 
	  public Customer updateCustomer(int id, Customer newCustomer) {
	        return customerRepository.findById(id)
	                .map(customer -> {
	                    customer.setName(newCustomer.getName());
	                    customer.setPhone(newCustomer.getPhone());
	                    customer.setMail(newCustomer.getMail());
	                    customer.setOrderId(newCustomer.getOrderId());
	                    return customerRepository.save(customer);
	                })
	                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
	    }

	    public void deleteCustomer(int id) {
	        customerRepository.deleteById(id);
	    }

}
