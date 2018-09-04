package com.stackroute.controller;

import java.security.acl.Owner;

import com.stackroute.entity.HotelBookingInterface;
import com.stackroute.entity.HotelRoomDetails;

public class HotelUserController implements HotelUserControllerInterface {
		
	HotelUserController	hotelUserController;
		private HotelBookingInterface BookingDetails;
		//private HotelOwnerController hotelOwnerController;
		
		public HotelUserController() {
			
			hotelUserController = new HotelUserController();
		}
		HotelRoomDetails roomDetails ;
		@Override
		public void Login(String name, String Password) {
			// TODO Auto-generated method stub
			hotelUserController.setName(name);
			hotelUserController.setPassword(Password);
		}
		private void setPassword(String password) {
			// TODO Auto-generated method stub
			
		}
		private void setName(String name) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void hotelBookingDetails(HotelBookingInterface BookingDetails) {
			// TODO Auto-generated method stub
			BookingDetails.setBookingId(1);
			this.BookingDetails = BookingDetails;
		}
		@Override
		public String HotelBookingStatus() {
			// TODO Auto-generated method stub
			return "your booking id is "+BookingDetails.getBookingId();
		}
		
		
	}


