package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfFourTest {

	@Test
	public void powerOfFourForNumberTrue() {
		
		//arrange
		PowerOfFour powerOfFour = new PowerOfFour();
		
		//int expectedNumber = 64;
		
		//act
		boolean result = powerOfFour.checkPower(64);
		
		
		//assert
		assertTrue(result);
	}
	
	@Test
	public void powerOfFourForNumberFalse() {
		
		//arrange
		PowerOfFour powerOfFour = new PowerOfFour();
		
		//int expectedNumber = 65;
		
		//act
		boolean result = powerOfFour.checkPower(65);
		
		
		//assert
		assertFalse(result);
	}

}
