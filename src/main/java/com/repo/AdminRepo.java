package com.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.model.Admin;

public interface AdminRepo extends CrudRepository<Admin, Integer> {

	@Query("select npt from Admin npt where npt.id= :parkingLotId")
	Admin findById(@Param("parkingLotId") int parkingLotId);
	
}
