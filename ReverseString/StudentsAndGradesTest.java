package com.stackroute.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentsAndGradesTest {

	    @Test
	    public void testGrades() {
	        //Arrange
	        StudentsAndGrades studentsGrade = new StudentsAndGrades();
	        double expectedAverage = 81.50;
	    int[] inputArray = new int[]{86, 65, 98, 77}; 
	        int expectedMinimum = 65;
	        int expectedMaximum = 98;
	      int expectedGradesLength = 4;  
	        //Act
	        int actualUserInput = studentsGrade.studentsAverageGrade();
	        double actualAverage = studentsGrade.studentsAverageGrade(expectedGradesLength);
	        int actualMinimum = studentsGrade.minimumGrade(inputArray);
	       int actualMaximum = studentsGrade.maximumGrade(inputArray);
	        
	        //Assert
	        assertEquals(expectedAverage, actualAverage, 0.0);
	        assertEquals(expectedMinimum, actualMinimum);
	        assertEquals(expectedMaximum, actualMaximum);
}
}