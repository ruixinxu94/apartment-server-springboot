package com.mercury.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mercury.project.bean.LeasePayment;


public interface LeasePaymentDao extends JpaRepository<LeasePayment, Long>{
	Boolean existsByUsername(String username);
	@Modifying
	@Query("update LeasePayment l set l.balance = ?1, l.payment =?2, paydate = ?3 where l.username = ?4")
	void setBalanceByUsername(int balance, int payment, String paydate, String username);
	@Modifying
	@Query("select l from LeasePayment l where l.username = ?1")
	List<LeasePayment> findByUsername(String username);

}
