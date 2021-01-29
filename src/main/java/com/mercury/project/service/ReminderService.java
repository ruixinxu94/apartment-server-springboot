package com.mercury.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercury.project.bean.Reminder;
import com.mercury.project.dao.ReminderDao;

@Transactional
@Service
public class ReminderService {
	
	@Autowired
	ReminderDao reminderDao;
	
	public List<Reminder> getAllReminders() {
		return reminderDao.findAll();
	}
	
	public boolean addReminder(Reminder reminder) {
		if (reminderDao.existsById(reminder.getId())) {
			return false;
		}
		reminderDao.save(reminder);
		return true;
	}
	
	public boolean editReminder(Reminder reminder) {
		if (!reminderDao.existsById(reminder.getId())) {
			return false;
		}
		reminderDao.setReminderById(reminder.getType(), reminder.getContent(), reminder.getStatus(), reminder.getId());
		return true;
	}
	
	public boolean deleteReminder(Long id) {
		if (!reminderDao.existsById(id)) {
			return false;
		}
		reminderDao.deleteById(id);
		return true;
	
	}
	
}
