package com.stackroute.entity;

public interface HotelBookingInterface {

	public void setBookingId(int bookingId);
	
	public void setOwnerHotelDetails(HotelOwnerInterface hotelOwnerInterface);
	
	public void setUser(HotelUserInterface hotelUserInterface);
	
	
	public int getBookingId();
	
	public HotelOwnerInterface getOwnerHotelDetails();
	
	public HotelUserInterface getUser();
}
