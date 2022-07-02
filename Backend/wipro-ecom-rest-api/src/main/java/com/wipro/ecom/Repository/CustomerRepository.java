package com.wipro.ecom.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ecom.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository< Customer,Integer>{
	
	

}