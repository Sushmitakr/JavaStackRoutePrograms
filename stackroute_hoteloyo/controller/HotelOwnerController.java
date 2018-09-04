package com.stackroute.controller;

import com.stackroute.entity.HotelBookingInterface;
import com.stackroute.entity.HotelOwner;

public class HotelOwnerController implements HotelOwnerControllerInterface {

	private HotelOwner hotelOwner;
	
	//login
	public HotelOwnerController()
	{
		hotelOwner=new HotelOwner();
	}
	//@Override
	public void login(String hotelName,String hotelAddress,double hotelPrice)
	{
		hotelOwner.setHotelName(hotelName);
		hotelOwner.setHotelAddress(hotelAddress);
		hotelOwner.setHotelPrice(hotelPrice);	
	}
	
	//booking details
	public void hotelBookingDetails(HotelBookingInterface bookinginfo)
	{
		
	}
	//booking status
	public String bookingHotelStatus()
	{
		return null;
	}
}
