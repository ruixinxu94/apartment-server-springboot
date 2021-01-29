package com.mercury.project.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.mercury.project.bean.User;

public interface UserDao extends JpaRepository<User, Long>{

	Boolean existsByUsername(String username);
	User findByUsername(String username);
	void deleteByUsername(String username);
	@Modifying
	@Query("update User u set u.job = ?1, u.room = ?2, u.leaseend = ?3, u.leasestart = ?4, u.rental = ?5 where u.username = ?6")
	void setUserInfoByUsername(String job, int room, String leaseend, String leasestart, int rental, String username);
	
	@Modifying
	@Query("update User u set u.password = ?1 where u.username = ?2")
	void setPasswordByUsername(String password, String username);
	
	
}
