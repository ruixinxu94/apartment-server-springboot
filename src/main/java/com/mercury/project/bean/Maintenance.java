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
@Table(name="PROJECT_MAINTENANCE")
public class Maintenance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PROJECT_MAINTENANCE_SEQ")
	@SequenceGenerator(name = "PROJECT_MAINTENANCE_SEQ", sequenceName = "PROJECT_MAINTENANCE_SEQ", allocationSize = 1)
	@NotNull
	private Long id = (long) 0;
	@Column (name="roomnumber")
	private int roomnumber;
	@Column (name = "lastname")
	private String lastname;
	@Column (name = "firstname")
	private String firstname;
	@Column (name = "email")
	private String email;
	@Column (name ="facility")
	private String facility;
	@Column (name = "description")
	private String description;
	@Column (name = "anytime")
	private String anytime;
	@Column (name = "status")
	private String status;
	@Column (name = "time")
	private String time;
	public Maintenance() {
		super();
	}
	public Maintenance(@NotNull Long id, int roomnumber, String lastname, String firstname, String email,
			String facility, String description, String anytime, String status, String time) {
		super();
		this.id = id;
		this.roomnumber = roomnumber;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.facility = facility;
		this.description = description;
		this.anytime = anytime;
		this.status = status;
		this.time = time;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnytime() {
		return anytime;
	}
	public void setAnytime(String anytime) {
		this.anytime = anytime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Maintenance1 [id=" + id + ", roomnumber=" + roomnumber + ", lastname=" + lastname + ", firstname="
				+ firstname + ", email=" + email + ", facility=" + facility + ", description=" + description
				+ ", anytime=" + anytime + ", status=" + status + ", time=" + time + "]";
	}
	
	
	
	
}