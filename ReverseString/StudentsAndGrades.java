package com.stackroute.utilities;

import java.util.Scanner;

public class StudentsAndGrades {
	Scanner sc = new Scanner(System.in);

	int numberOfElements = sc.nextInt();
	int[] grades = new int[numberOfElements];
	int glen = grades.length;
	
	public int studentsAverageGrade(int glen){
		int avg = 0;
		int i=0;
		int sum=0;

		for(i=0;i<=grades.length;i++) {
			System.out.println("Enter the number of element:");
			grades[i] = sc.nextInt();
			sum = sum + grades[i];
		}
		avg = sum/4;
		System.out.println("Average="+avg);

		System.out.println(avg);
		return avg;
	}

	//Method for getting maximum value
	public static int maximumGrade(int[] inputArray){ 
		int maxValue = inputArray[0];

		for(int i=1;i < inputArray.length;i++){
			if(inputArray[i] > maxValue){ 
				maxValue = inputArray[i]; 
			}
		} 
		System.out.println(maxValue);
		return maxValue;
	}

	// Method for getting the minimum value
	public static int minimumGrade(int[] inputArray){ 
		int minValue = inputArray[0]; 
		for(int i=1;i<inputArray.length;i++){ 
			if(inputArray[i] < minValue){ 
				minValue = inputArray[i]; 
			} 
		}
		return minValue; 
	}
}
