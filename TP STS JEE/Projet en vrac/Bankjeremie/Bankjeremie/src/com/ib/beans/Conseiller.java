package com.ib.beans;

public class Conseiller {
	
	public String getExternal_ID() {
		return External_ID;
	}
	public void setExternal_ID(String external_ID) {
		External_ID = external_ID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	public String getDate_update() {
		return date_update;
	}
	public void setDate_update(String date_update) {
		this.date_update = date_update;
	}
	public int getAdvisorid() {
		return advisorid;
	}
	public void setAdvisorid(int advisorid) {
		this.advisorid = advisorid;
	}
	public int getAdvisor() {
		return advisor;
	}
	public void setAdvisor(int advisor) {
		this.advisor = advisor;
	}
	
	String External_ID;
	String firstname;
	String lastname;
	String email;
	String password;
	String dob;
	String phone;
	String date_creation;
	String date_update;
	int advisorid;
	int advisor;
	
	
}
