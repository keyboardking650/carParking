package com.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.model.Admin;
import com.model.Manager;

public interface ManagerRepo extends CrudRepository<Manager, Integer>{

	
	@Query("select mpt from Manager mpt where mpt.parkingAreaCode= :parkingAreaCode")
	Manager findById(@Param("parkingAreaCode") int parkingAreaCode);
}
