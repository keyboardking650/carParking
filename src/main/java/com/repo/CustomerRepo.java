package com.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.model.Admin;
import com.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	@Query("select cbt from Customer cbt where cbt.id= :vehicleNo")
	Customer findById(@Param("vehicleNo") int vehicleNo);
	
}
