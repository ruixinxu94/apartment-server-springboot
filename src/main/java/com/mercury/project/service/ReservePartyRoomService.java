package com.mercury.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercury.project.bean.ReservePartyRoom;
import com.mercury.project.dao.ReservePartyRoomDao;

@Transactional
@Service
public class ReservePartyRoomService {
	@Autowired
	ReservePartyRoomDao reservePartyRoomDao ;
	
	public List<ReservePartyRoom> getAllReservePartyRoom() {
		return reservePartyRoomDao.findAll();
	}
	
	public boolean addReservePartyRoom(ReservePartyRoom reservePartyRoom) {
		if (!reservePartyRoomDao.existsById(reservePartyRoom.getId())) {
			reservePartyRoomDao.save(reservePartyRoom);
			return true;
		}
		return false;
	}
}
