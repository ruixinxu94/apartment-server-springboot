package com.mercury.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mercury.project.bean.ReservePartyRoom;

public interface ReservePartyRoomDao extends JpaRepository<ReservePartyRoom, Long>{
	
}
