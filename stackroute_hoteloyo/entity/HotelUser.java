package com.stackroute.entity;

public class HotelUser implements HotelUserInterface {

	String userName;
	String password;
	String confirmPassword;
	
	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}
	@Override
	public void setConfirmPassword(String confirmPassword) {
		// TODO Auto-generated method stub
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String userName() {
		// TODO Auto-generated method stub
		return userName;
	}
	@Override
	public String password() {
		// TODO Auto-generated method stub
		return password;
	}
	@Override
	public String confirmPassword() {
		// TODO Auto-generated method stub
		return confirmPassword;
	}
}
