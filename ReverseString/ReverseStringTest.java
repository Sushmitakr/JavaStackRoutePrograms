package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		//arrange
		ReverseString rev = new ReverseString();
		String ev = "olleh";
		//act
		String res = rev.revStr("hello");
		
		//assert
		assertEquals(ev, res);
	}

}
