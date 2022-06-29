package com.wipro.med.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.wipro.med.Service.SaleService;
import com.wipro.med.entity.Sale;

@RestController
@RequestMapping("/sale")
public class SaleController {
	@Autowired
	private SaleService ss;
	@PostMapping
	public Sale registerSale(@RequestBody Sale sale)
	{
		return ss.create(sale);
	}
	@GetMapping
	public List<Sale> finadAllSale() {
		return ss.read();
	}
	@GetMapping("/{id}")
	public Sale findSaleById(@PathVariable("id") Integer id) {
		return ss.read(id);
	}
	@PutMapping
	public Sale updateSale(@RequestBody Sale sale) {
		return ss.update(sale);
	}
	@DeleteMapping("/{id}")
	public Sale deletSale(@PathVariable("id")Integer id)
	{
		return ss.delete(id);
	}
}