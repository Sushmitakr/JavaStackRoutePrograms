package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringManagerTest {
	StringManager stringManager;
	@Before
	public void setUp()
	{
		stringManager = new StringManager();
		
	}

	@Test
	public void test() {
		//arrange
		 
		String expectedValue = "helloworld";
		//act
		String result =  stringManager.concatString("hello", "world");
		//assert
		assertEquals(expectedValue, result);
	}
	
	@Test        //(timeout = 1000)
	public void testUpper() {
		//arrange
		String expectedResult = "HELLOWORLD";
		//act
		String result = stringManager.upperCase("helloworld");
		//assert
		assertEquals(expectedResult, result);
		
	}
	@After
	public void tearDown() {
		stringManager = null;
	}

}
