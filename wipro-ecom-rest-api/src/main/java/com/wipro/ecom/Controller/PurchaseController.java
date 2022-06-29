package com.wipro.ecom.Controller;

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

import com.wipro.ecom.entity.Purchase;
import com.wipro.ecom.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	@Autowired
	private PurchaseService ms;
	
	@PostMapping
	public Purchase registerPurchase(@RequestBody Purchase purchase)
	{
		return ms.create(purchase);
	}
	
	@GetMapping
	public List<Purchase> findAllPurchase()
	{
		return ms.read();
	}
	
	@GetMapping("/{id}")
	public Purchase findPurchaseById(@PathVariable("id") Integer id)
	{
		return ms.read(id);
	}
	
	@PutMapping
	public Purchase updatePurchase(@RequestBody Purchase purchase)
	{
		return ms.update(purchase);
	}
	
	@DeleteMapping("/{id}")
	public Purchase deletePurchase(@PathVariable("id") Integer id)
	{
		return ms.delete(id);
	}

}
