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
@Table(name="PROJECT_RESERVEPARTYROOM")
public class ReservePartyRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PROJECT_REMINDER_SEQ")
	@SequenceGenerator(name = "PROJECT_REMINDER_SEQ", sequenceName = "PROJECT_REMINDER_SEQ", allocationSize = 1)
	@NotNull
	private Long id = (long) 0;
	@Column (name = "firstname", nullable = false)
	private String firstname;
	@Column (name = "lastname", nullable = false)
	private String lastname;
	@Column (name = "phone",  nullable = false)
	private String phone ;
	@Column (name = "starttime", nullable = false)
	private String starttime;
	
	
	public ReservePartyRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservePartyRoom(@NotNull Long id, String firstname, String lastname, String phone, String starttime,
			String endtime) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.starttime = starttime;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}





	@Override
	public String toString() {
		return "ReservePartyRoom [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", starttime=" + starttime ;
	}
	
	
	
	
}
