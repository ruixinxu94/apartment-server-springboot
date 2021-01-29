package com.mercury.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mercury.project.bean.User;
import com.mercury.project.dao.UserDao;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDao userDao;

	@Autowired
	PasswordEncoder passwordEncoder;

	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	public boolean addUser(User user) {
		if (!userDao.existsByUsername(user.getUsername()) && !userDao.existsById(user.getId())) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userDao.save(user);
			return true;
		}
		return false;
	}

	public boolean editUser(User user) {

		if (!userDao.existsByUsername(user.getUsername())) {
			return false;
		}
		userDao.setUserInfoByUsername(user.getJob(), user.getRoom(), user.getLeaseend(), user.getLeasestart(),
				user.getRental(), user.getUsername());
		return true;
	}

	public boolean editPassword(String email, String newPassword) {
		if (userDao.existsByUsername(email)) {
			userDao.setPasswordByUsername(passwordEncoder.encode(newPassword), email);
			return true;
		}
		return false;
	}

	public boolean deleteUser(String username) {
		if (!userDao.existsByUsername(username)) {
			return false;
		}
		userDao.deleteByUsername(username);
		return true;
	}

}
