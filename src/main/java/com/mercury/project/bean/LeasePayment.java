package com.mercury.project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "PROJECT_LEASEPAYMENT")
public class LeasePayment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PROJECT_REMINDER_SEQ")
	@SequenceGenerator(name = "PROJECT_REMINDER_SEQ", sequenceName = "PROJECT_REMINDER_SEQ", allocationSize = 1)
	@NotNull
	private Long id = (long) 0;
	@Column (name = "payment", nullable = false)
	private int payment;
	@Column (name = "balance", nullable = false)
	private int balance;
	@Column (name = "paydate")
	private String paydate;
	@Column (name = "username")
	private String username;
	
	public LeasePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeasePayment(@NotNull Long id, int payment, int balance, String paydate, String username) {
		super();
		this.id = id;
		this.payment = payment;
		this.balance = balance;
		this.paydate = paydate;
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "LeasePayment [id=" + id + ", payment=" + payment + ", balance=" + balance + ", paydate=" + paydate
				+ ", username=" + username + "]";
	}
	
	
	
}
	

