package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Medicine;
import com.example.demo.repository.Medicinerepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {
	@Autowired
	private Medicinerepository mr ;
	
	public Medicine create(Medicine medicine ) {
		return mr.save(medicine);
	}
	public List<Medicine> read() {
		return mr.findAll();
	}
	public Medicine read(Integer id) {
		Optional<Medicine> temp=mr.findById(id);
		Medicine m=null;
		if(temp.isPresent()) 
		{
			m=temp.get();
		}
		return m;
	}
	public Medicine update(Medicine medicine) {
		Optional<Medicine> temp=mr.findById(medicine.getId());
		Medicine m=null;
		if(temp.isPresent()) 
		{
			m=medicine;
			mr.save(medicine);
		}
		return m;
	}
	public Medicine delete(Integer id) {
		Optional<Medicine> temp=mr.findById(id);
		Medicine m=null;
		if(temp.isPresent()) 
		{
			m=temp.get();
			mr.delete(m);
		}
		return m;
	}

}
