package com.stackroute.utilities;

import java.util.Scanner;

public class Factorial {
	int counter;
	int factorials = 1;
	Scanner sc = new Scanner(System.in);
	
	public boolean factorialsNum(int num) {
		num = sc.nextInt();
		if(num<13) {
			for (counter = 1; counter < num; counter++) {
		    	factorials =  factorials * counter;
		    	System.out.println(counter + factorials);
		    	
		    }
			return true;
		}else
		{
			return false;
		}
		
		 
	}
	 
	
}


	    
	    
	   
	    	

