package com.mercury.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mercury.project.bean.Reminder;

public interface ReminderDao extends JpaRepository<Reminder, Long>{
	@Modifying
	@Query("update Reminder r set r.type = ?1, r.content = ?2, r.status = ?3 where r.id = ?4")
	void setReminderById(String type, String content,String status, Long id);
}
