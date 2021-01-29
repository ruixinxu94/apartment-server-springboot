package com.mercury.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercury.project.bean.LeasePayment;
import com.mercury.project.dao.LeasePaymentDao;

@Service
@Transactional
public class LeasePaymentService {

	@Autowired
	LeasePaymentDao leasepaymentDao;

	public List<LeasePayment> getAllLeasePayment() {
		return leasepaymentDao.findAll();
	}

	public boolean addLeasePayment(LeasePayment leasePayment) {
		if (leasepaymentDao.existsById(leasePayment.getId())) {
			return false;
		}
		leasepaymentDao.save(leasePayment);
		return true;
	}

	public boolean editLeasePayment(LeasePayment leasePayment) {
		if (!leasepaymentDao.existsByUsername(leasePayment.getUsername())) {
			return false;
		}
		leasepaymentDao.setBalanceByUsername(leasePayment.getBalance(), leasePayment.getPayment(), leasePayment.getPaydate(), leasePayment.getUsername());
		return true;
	}

	public List<LeasePayment> findByUsername(String username) {
		return leasepaymentDao.findByUsername(username);

	}
}
