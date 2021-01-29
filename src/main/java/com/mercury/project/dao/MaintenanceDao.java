package com.mercury.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mercury.project.bean.Maintenance;

public interface MaintenanceDao extends JpaRepository<Maintenance, Long>{
	
	@Modifying
	@Query("update Maintenance r set r.roomnumber = ?1, r.lastname = ?2, r.firstname = ?3, r.email = ?4, r.facility = ?5, r.description = ?6, r.anytime = ?7, r.status = ?8, r.time = ?9 where r.id = ?10")
	void setMaintenanceById(int roomnumber, String lastname, String firstname, String email, String facility, String description, String anytime, String status, String time, Long id);
	
	@Modifying
	@Query("select r from Maintenance r where r.roomnumber = ?1")
	List<Maintenance> findByRoomnumber(int roomnumber);
	
}
