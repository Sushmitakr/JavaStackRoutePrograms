package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberTest {

	@Test
	public void test() {
		//arrange
		String expectedName = "Harry Potter";
		int expectedAge = 30;
		double expectedSalary = 2500;
		
		//act
		MemberVariable mv = new MemberVariable(expectedName, expectedAge, expectedSalary);
		
		//assert
		assertEquals("Name Mismatch", expectedName, mv.getMember().getName() );
		assertEquals("Age Mismatch", expectedAge, mv.getMember().getAge() );
		assertEquals("Salary Mismatch" , expectedSalary, mv.getMember().getSalary(), 0.0);
	}

}
