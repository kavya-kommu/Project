package com.example.demo.contoller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.service.MedicineService;
import com.example.demo.entity.Medicine;

@RestController
@RequestMapping("/medicine")
@CrossOrigin(origins= {"http://localhost:4200"})
public class Medicinecontroller {
	@Autowired
	private MedicineService ms;
	
	@PostMapping
	public Medicine addMedicine(@RequestBody Medicine medicine)
	{
		return ms.create(medicine);
	}
	
	@GetMapping
	public List<Medicine> getAllMedicine() {
		return ms.read();
	}
	/*
	@GetMapping("/{id}")
	public Medicine findMedicineById(@PathVariable("id") Integer id) {
		return ms.read(id);
	}
	
	@PutMapping
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		return ms.update(medicine);
	}
	
	@DeleteMapping("/{id}")
	public Medicine deleteMedicine(@PathVariable("id")Integer id)
	{
		return ms.delete(id);
	}
	*/
	@GetMapping("/name/{name}")
	public List<Medicine> findByName(@PathVariable("name") String name)
	{
		return ms.findMedicineByName(name);
	}
}
	
