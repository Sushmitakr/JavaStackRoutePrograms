package com.stackroute.entity;

public class HotelBooking implements HotelBookingInterface {

	private int bookingId;
	private HotelOwnerInterface hotelOwnerInterface;
	private HotelUserInterface hotelUserInterface;
	
	@Override
	public void setBookingId(int bookingId) {
		// TODO Auto-generated method stub
		this.bookingId = bookingId;
	}
	
	@Override
	public int getBookingId() {
		// TODO Auto-generated method stub
		return bookingId;
	}

	@Override
	public void setOwnerHotelDetails(HotelOwnerInterface hotelOwnerInterface) {
		// TODO Auto-generated method stub
		this.hotelOwnerInterface = hotelOwnerInterface;
	}

	@Override
	public HotelOwnerInterface getOwnerHotelDetails() {
		// TODO Auto-generated method stub
		return hotelOwnerInterface;
	}

	@Override
	public void setUser(HotelUserInterface hotelUserInterface) {
		// TODO Auto-generated method stub
		this.hotelUserInterface = hotelUserInterface;
	}

	@Override
	public HotelUserInterface getUser() {
		// TODO Auto-generated method stub
		return hotelUserInterface;
	}
	
	
}
