package com.stackroute.entity;

public interface HotelRoomDetailsInterface {

	public void setRoomNo(int roomNo);
	
	public void setOwner(HotelOwnerInterface hotelOwnerInterface);
	
	public int getRoomNo();
	
	public HotelOwnerInterface getOwner();
}
