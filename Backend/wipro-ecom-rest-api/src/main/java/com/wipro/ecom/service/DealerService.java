package com.wipro.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ecom.entity.Dealer;
import com.wipro.ecom.repository.DealerRepository;


@Service
public class DealerService {
	@Autowired
	private DealerRepository mr;
	
	public Dealer create(Dealer dealer) {
		return mr.save(dealer);
	}
	public List<Dealer> read() {
		return mr.findAll();
	}
	public Dealer read(Integer id) {
		Optional<Dealer> temp = mr.findById(id);
		Dealer d=null; 
		if(temp.isPresent()) {
			d=temp.get();
		}
		return d;
	}
	public Dealer update(Dealer dealer) {
		Optional<Dealer> temp = mr.findById(dealer.getId());
		Dealer d=null;
		if(temp.isPresent()) {
			d=temp.get();
			mr.save(dealer);
		}
		return d;
		
	}
	public Dealer delete(Integer id) {
		Optional<Dealer> temp=mr.findById(id);
		Dealer d=null;
		if(temp.isPresent()) 
		{
			d=temp.get();
			mr.delete(d);
		}
		return d;
	}

}
