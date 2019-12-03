package com.bloodbankapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BloodBankDetails")
public class BloodBankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="userName")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="bloodGroup")
	private String bloodGroup;
	@Column(name="contactNo")
	private long contactNo;
	@Column(name="status")
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BloodBankDetails() {
		super();
	}
	public BloodBankDetails(int id, String userName, String password, String role, String bloodGroup, long contactNo,
			String status) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.bloodGroup = bloodGroup;
		this.contactNo = contactNo;
		this.status = status;
	}
	
}
