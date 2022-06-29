package com.wipro.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.ecom.entity.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

}
