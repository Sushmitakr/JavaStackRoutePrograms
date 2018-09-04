package com.stackroute.entity;

public class HotelRoomDetails implements HotelRoomDetailsInterface{

	int roomNo;
	HotelOwnerInterface hotelOwnerInterface;
	
	@Override
	public void setRoomNo(int roomNo) {
		// TODO Auto-generated method stub
		this.roomNo = roomNo;
	}
	
	@Override
	public int getRoomNo() {
		// TODO Auto-generated method stub
		return roomNo;
	}

	@Override
	public void setOwner(HotelOwnerInterface hotelOwnerInterface) {
		// TODO Auto-generated method stub
		this.hotelOwnerInterface = hotelOwnerInterface;
	}

	@Override
	public HotelOwnerInterface getOwner() {
		// TODO Auto-generated method stub
		return hotelOwnerInterface;
	}
	
	
	
}
