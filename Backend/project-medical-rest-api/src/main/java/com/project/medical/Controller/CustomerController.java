package com.project.medical.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.medical.Service.CustomerService;
import com.project.medical.entity.Customer;

@RequestMapping("/customer")
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@PostMapping
	public Customer registerCustomer(@RequestBody Customer customer)
	{
		return cs.create(customer);
	}
	@GetMapping
	public List<Customer> findAllCustomers()
	{
		return cs.read();
	}
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return cs.update(customer);
	}
	@DeleteMapping("/{id}")
	public Customer deleteCustomer(@PathVariable("id") Integer id)
	{
		return cs.delete(id);
	}
	
		
	
}
