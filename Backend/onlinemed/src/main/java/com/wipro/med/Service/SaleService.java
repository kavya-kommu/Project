package com.wipro.med.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.med.entity.Sale;
import com.wipro.med.repository.SaleRepository;



@Service
public class SaleService {

	@Autowired
	private SaleRepository sr;
	
	public Sale create(Sale sale) {
		return sr.save(sale);
	}
	public List<Sale> read() {
		return sr.findAll();
	}
	public Sale read(Integer id) {
		Optional<Sale> temp = sr.findById(id);
		Sale s=null;
		if(temp.isPresent())
		{
			s=temp.get();
		}
		return s;
	}
	public Sale update(Sale sale) {
		Optional<Sale> temp = sr.findById(sale.getId());
		Sale s=null;
		if(temp.isPresent())
		{
			s=sale ;
			sr.save(sale);
		}
		return s;
	}
	public Sale  delete(Integer id) {
		Optional<Sale > temp = sr.findById(id);
		Sale s=null;
		if(temp.isPresent())
		{
			s=temp.get();
			sr.delete(s);
		}
		return s;
	}
	
}