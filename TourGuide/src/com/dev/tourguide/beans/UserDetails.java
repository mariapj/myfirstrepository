package com.dev.tourguide.beans;

public class UserDetails {
	
	private Integer id;
	private String Name;
	
	private String emailAddress;
	private String password;
	private String mobile;
	
	public UserDetails() {
		super();
	}
	public UserDetails(Integer id, String name, String emailAddress, String password,String mobile) {
		super();
		this.id = id;
		this.Name = name;
		
		this.emailAddress = emailAddress;
		this.password = password;
		this.mobile=mobile;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setFirstName(String firstName) {
		this.Name = firstName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
