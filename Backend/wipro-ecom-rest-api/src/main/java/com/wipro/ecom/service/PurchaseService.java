package com.wipro.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecom.entity.Purchase;
import com.wipro.ecom.repository.PurchaseRepository;

@Service
public class PurchaseService {
	@Autowired
	private PurchaseRepository mr;
	
	public Purchase create(Purchase purchase) {
		return mr.save(purchase);
	}
	
	public List<Purchase> read() {
		return mr.findAll();
	}
	public Purchase read(Integer id) {
		Optional<Purchase>temp = mr.findById(id);
		Purchase p=null;
		if(temp.isPresent())
		{
			p=temp.get();
		}
		return p;
	}
	public Purchase update(Purchase purchase) {
		Optional<Purchase> temp = mr.findById(purchase.getId());
		Purchase p=null;
		if(temp.isPresent())
		{
			p=purchase;
			mr.save(purchase);
		}
		return p;
	}
	public Purchase delete(Integer id) {
		Optional<Purchase>temp = mr.findById(id);
		Purchase p=null;
		if(temp.isPresent())
		{
			p=temp.get();
			mr.delete(p);
		}
		return p;
		
	}
	
	
}