package com.project.medical.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medical.entity.Customer;
import com.project.medical.repository.CustomerRepository;



@Service
public class CustomerService {

	@Autowired
	private CustomerRepository cr;
	
	public Customer create(Customer customer) {
		return cr.save(customer);
	}
	public List<Customer> read() {
		return cr.findAll();
	}
	public Customer read(Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
		}
		return c;
	}
	public Customer update(Customer customer) {
		Optional<Customer> temp = cr.findById(customer.getid());
		Customer c=null;
		if(temp.isPresent())
		{
			c=customer ;
			cr.save(customer);
		}
		return c;
	}
	public Customer  delete(Integer id) {
		Optional<Customer > temp = cr.findById(id);
		Customer c=null;
		if(temp.isPresent())
		{
			c=temp.get();
			cr.delete(c);
		}
		return c;
	}
	
}

