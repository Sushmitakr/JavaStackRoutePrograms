package com.stackroute.controller;

import com.stackroute.entity.HotelBookingInterface;

public interface HotelUserControllerInterface {

	public void Login(String name,String Password);
	public void hotelBookingDetails(HotelBookingInterface BookingDetails);
	public String HotelBookingStatus();
}
