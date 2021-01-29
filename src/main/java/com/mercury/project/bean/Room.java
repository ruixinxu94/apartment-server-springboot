package com.mercury.project.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "PROJECT_ROOM")
public class Room {
	@Id
	private Long id;
	@Column
	private String type;
	@Column
	private int price;
	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	public Room() {
		super();
	}
	public Room(Long id, String type, int price, User user) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", type=" + type + ", price=" + price + ", user=" + user + "]";
	}
	
}


