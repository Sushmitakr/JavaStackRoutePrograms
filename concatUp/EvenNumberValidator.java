package com.stackroute.utilities;

//import static org.hamcrest.CoreMatchers.instanceOf;

public class EvenNumberValidator {

	public boolean validateEvenNumber(Object obj) {
		int num = (int)obj;
		if(num%2 == 0)
		{
			return true;
		}
		else {
			return false;
		}
			
	}
}
