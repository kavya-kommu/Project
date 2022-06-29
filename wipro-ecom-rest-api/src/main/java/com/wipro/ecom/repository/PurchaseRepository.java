package com.wipro.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ecom.entity.Purchase;


@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}