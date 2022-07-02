package com.wipro.ecom.services;
import org.springframework.stereotype.Service;
import com.wipro.ecom.entity.Medicine;
import com.wipro.ecom.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository mr ;

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

	public List<Medicine> findMedicineByName(String name)
	{
		return mr.findByName(name);
	}

}