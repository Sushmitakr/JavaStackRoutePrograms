package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenNumberValidatorTest {

	@Test
	 public void testValidateEvenNumber() {
		//arrange
		EvenNumberValidator evenNumberValidator = new EvenNumberValidator();
		//act
		boolean result = evenNumberValidator.validateEvenNumber(4);
		//assert
		assertTrue(result);
	}

	@Test
	 public void testMethodReturnsFalseForString() {
		//arrange
		EvenNumberValidator evenNumberValidator = new EvenNumberValidator();
		//act
		boolean result = evenNumberValidator.validateEvenNumber("querty");
		//assert
		assertFalse(result);
	}

}
