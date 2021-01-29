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
@Table(name = "PROJECT_REMINDER")
public class Reminder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PROJECT_REMINDER_SEQ")
	@SequenceGenerator(name = "PROJECT_REMINDER_SEQ", sequenceName = "PROJECT_REMINDER_SEQ", allocationSize = 1)
	@NotNull
	private Long id = (long) 0;
	@Column (name = "type", nullable = false)
	private String type;
	@Column (name = "content", nullable = false)
	private String content;
	@Column (name = "status",  nullable = false)
	private String status ;

	public Reminder() {
		super();
	}

	public Reminder(Long id, String type, String content, String status) {
		super();
		this.id = id;
		this.type = type;
		this.content = content;
		this.status = status;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reminder [id=" + id + ", type=" + type + ", content=" + content + ", status=" + status + "]";
	}

	
	
	

}