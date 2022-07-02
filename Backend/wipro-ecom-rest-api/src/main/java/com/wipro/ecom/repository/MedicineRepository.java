package com.wipro.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.wipro.ecom.entity.*;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{
	List<Medicine>findByName(String name);
}