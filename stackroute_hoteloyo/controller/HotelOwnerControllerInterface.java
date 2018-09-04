package com.stackroute.controller;

import com.stackroute.entity.HotelBookingInterface;

public interface HotelOwnerControllerInterface {
	
	public void login(String hotelname,String hoteladdress,double hotelPrice);
	public void hotelBookingDetails(HotelBookingInterface bookinginfo);
	public String bookingHotelStatus();
	
}
