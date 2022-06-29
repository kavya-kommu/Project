package com.project.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.medical.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository< Customer,Integer>{
	
	

}



