package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberSortTest {

	@Test
	public void testSortReturnsSortedDescArray() {
		 //Arrange
        NumberSort descending = new NumberSort();
        int[] intArray = new int[]{ 5,3,2,1 };
        
        //Act
       int[] resultArray = descending.sort(intArray);
       
       //Assert
       assertEquals(5,resultArray[0]);
       assertEquals(1,resultArray[resultArray.length-1]);
       assertEquals(4,resultArray.length);
       
        
	}

}
