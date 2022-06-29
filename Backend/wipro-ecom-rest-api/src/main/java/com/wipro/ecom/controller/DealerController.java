package com.wipro.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecom.entity.Dealer;
import com.wipro.ecom.service.DealerService;



@RestController
@RequestMapping("/dealer")
public class DealerController {
	@Autowired 
	private DealerService ms;
	
	@PostMapping
	public Dealer registerDealer(@RequestBody Dealer dealer) 
	{
		return ms.create(dealer);
	}
	
	@GetMapping
	public List<Dealer> findAllDealer()
	{
		return ms.read();
	}
	
	@GetMapping("/{id}")
	public Dealer findDealerById(@PathVariable("id") Integer id)
	{
		return ms.read(id);
	}
	
	@PutMapping
	public Dealer updateDealer(@RequestBody Dealer dealer)
	{
		return ms.update(dealer);
	}
	
	@DeleteMapping("/{id}")
	public Dealer deleteDealer(@PathVariable("id") Integer id)
	{
		return ms.delete(id);
	}

}
