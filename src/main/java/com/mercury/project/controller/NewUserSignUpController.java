package com.mercury.project.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.project.dao.UserDao;
import com.mercury.project.mail.EmailService;
import com.mercury.project.service.UserService;

@RestController
@RequestMapping("/newusersignup")
@CrossOrigin(origins = "http://localhost:3001")
public class NewUserSignUpController {

	@Autowired
	UserDao userDao;
	@Autowired
	public EmailService emailService;
	@Autowired
	public UserService userService;

	@PostMapping("/post")
	public Map<String, String> postEmailandResetPassword(@RequestBody String emailAddress) {
		emailAddress = emailAddress.replaceAll("%40", "@");
		emailAddress = emailAddress.replaceAll("=", "");
		System.out.println(emailAddress);
		Map<String, String> map = new HashMap<>();
		boolean flag = userDao.existsByUsername(emailAddress);
		System.out.println(flag);
		if (flag) {
			String tempPassword = getAlphaNumericString(8);
			emailService.sendSimpleMessage(emailAddress, "Password for New Account",
					"Welcome! We received your request for signing up a new account" + ", your temp password is "
							+ tempPassword + ". Please don't tell others the password"
							+ ", and you can reset your password when login into your account.");
			
			map.put("success", String.valueOf(userService.editPassword(emailAddress, tempPassword)));
			System.out.println(map);
			return map;
		}
		map.put("success","false");
		return map;
	}

	private static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}