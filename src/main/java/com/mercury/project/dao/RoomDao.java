package com.mercury.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mercury.project.bean.Room;
import com.mercury.project.bean.User;


public interface RoomDao extends JpaRepository<Room, Long>{
	@Modifying
	@Query("update Room r set r.price = ?1, r.user = ?2 where r.id = ?3")
	void setPriceById(int price, User user, Long id);
}
