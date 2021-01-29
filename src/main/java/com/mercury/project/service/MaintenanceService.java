package com.mercury.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercury.project.bean.Maintenance;
import com.mercury.project.dao.MaintenanceDao;

@Transactional
@Service
public class MaintenanceService {
	
	@Autowired
	MaintenanceDao maintenanceDao;
	
	public List<Maintenance> getAllMaintenances() {
		return maintenanceDao.findAll();
	}
	
	public boolean addMaintenance(Maintenance maintenance1) {
		if (maintenanceDao.existsById(maintenance1.getId())) {
			return false;
		}
		maintenanceDao.save(maintenance1);
		return true;
	}
	
	public boolean editMaintenance(Maintenance maintenance1) {
		if (!maintenanceDao.existsById(maintenance1.getId())) {
			return false;
		}
		maintenanceDao.setMaintenanceById(maintenance1.getRoomnumber(), maintenance1.getLastname(),
				maintenance1.getFirstname(), maintenance1.getEmail(), maintenance1.getFacility(),
				maintenance1.getDescription(), maintenance1.getAnytime(),maintenance1.getStatus(),maintenance1.getTime(),
				 maintenance1.getId());
		return true;
	}

	public List<Maintenance> findByRoomnumber(Integer roomnumber) {
		return maintenanceDao.findByRoomnumber(roomnumber);

	}

}


