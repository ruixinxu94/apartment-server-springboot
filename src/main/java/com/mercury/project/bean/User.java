package com.mercury.project.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "PROJECT_USER")
public class User implements UserDetails {

	@Id
	private Long id;
	@Column
	private String username;
	@Column
	private String birthday;
	@Column
	private String email;
	@Column
	private String job;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String password;
	@Column
	private int room;
	@Column
	private int salary;
	@Column
	private String leasestart;
	@Column
	private String leaseend;
	@Column
	private int rental;

	public User() {
		super();
	}



	public User(Long id, String username, String birthday, String email, String job, String firstname, String lastname,
			String password, int room, int salary, String leasestart, String leaseend, int rental) {
		super();
		this.id = id;
		this.username = username;
		this.birthday = birthday;
		this.email = email;
		this.job = job;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.room = room;
		this.salary = salary;
		this.leasestart = leasestart;
		this.leaseend = leaseend;
		this.rental = rental;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public String getLeasestart() {
		return leasestart;
	}



	public void setLeasestart(String leasestart) {
		this.leasestart = leasestart;
	}



	public String getLeaseend() {
		return leaseend;
	}



	public void setLeaseend(String leaseend) {
		this.leaseend = leaseend;
	}



	public int getRental() {
		return rental;
	}



	public void setRental(int rental) {
		this.rental = rental;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", email=" + email + ", job="
				+ job + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", room="
				+ room + ", salary=" + salary + ", leasestart=" + leasestart + ", leaseend=" + leaseend + ", rental="
				+ rental + "]";
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
