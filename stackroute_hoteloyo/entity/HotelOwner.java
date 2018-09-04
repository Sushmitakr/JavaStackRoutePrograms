package com.stackroute.entity;

public class HotelOwner implements HotelOwnerInterface {

	String hotelName;
	String hotelAddress;
	double hotelPrice;
	
	@Override
	public void setHotelName(String hotelName) {
		// TODO Auto-generated method stub
		this.hotelName = hotelName;
	}
	@Override
	public void setHotelAddress(String hotelAddress) {
		// TODO Auto-generated method stub
		this.hotelAddress = hotelAddress;
	}
	@Override
	public void setHotelPrice(double hotelPrice) {
		// TODO Auto-generated method stub
		this.hotelPrice = hotelPrice;
	}
	@Override
	public String getHotelName() {
		// TODO Auto-generated method stub
		return hotelName;
	}
	@Override
	public String getHotelAddress() {
		// TODO Auto-generated method stub
		return hotelAddress;
	}
	@Override
	public double getHotelPrice() {
		// TODO Auto-generated method stub
		return hotelPrice;
	}
	
}
