package com.mercury.project.bean;

public class PasswordMatching {

	String oldPassword;
	String newPassword;
	String emailAddress;
	public PasswordMatching() {
		super();
	}
	public PasswordMatching(String oldPassword, String newPassword, String emailAddress) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.emailAddress = emailAddress;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PasswordMatching [oldPassword=" + oldPassword + ", newPassword=" + newPassword + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
}