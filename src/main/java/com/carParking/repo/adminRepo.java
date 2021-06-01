package com.carParking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.carParking.model.admin;

public interface adminRepo extends CrudRepository<admin, Integer>{

}
