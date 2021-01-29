package com.mercury.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercury.project.bean.Room;
import com.mercury.project.dao.RoomDao;

@Service
@Transactional
public class RoomService {
	@Autowired
	RoomDao roomDao;
	
	public List<Room> getAllRooms() {
		return roomDao.findAll();
	}
	
	public boolean addRoom(Room room) {
		if (!roomDao.existsById(room.getId())) {
			roomDao.save(room);
			return true;
		}
		return false;
	}
	public boolean editRoom(Room room) {
		if (roomDao.existsById(room.getId())) {
			roomDao.setPriceById(room.getPrice(), room.getUser(), room.getId());
		
			return true;
		}
		return false;
	}
	


}

