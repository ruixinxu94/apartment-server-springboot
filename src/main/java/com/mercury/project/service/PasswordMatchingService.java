package com.mercury.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercury.project.bean.PasswordMatching;
import com.mercury.project.bean.User;
import com.mercury.project.dao.UserDao;

@Service
@Transactional
public class PasswordMatchingService {

	@Autowired
	UserDao userDao;

	@Autowired
	PasswordEncoder passwordEncoder;

	public boolean resetPassword(PasswordMatching passwordMatching) {
		if (userDao.existsByUsername(passwordMatching.getEmailAddress())) {
			User user = userDao.findByUsername(passwordMatching.getEmailAddress());
			boolean flag = passwordEncoder.matches(passwordMatching.getOldPassword(), user.getPassword());
			if (flag) {
				userDao.setPasswordByUsername(passwordEncoder.encode(passwordMatching.getNewPassword()),
						passwordMatching.getEmailAddress());
				return true;
			}
			return false;
		}
		return false;
	}

}
