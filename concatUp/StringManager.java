package com.stackroute.utilities;

import java.util.Scanner;

public class StringManager {

	String str1,str2;
	public String concatString(String str1, String str2) {
		 str1 = str1.concat(str2);
		 System.out.println("string after concatination:"+ str1);
		 return str1;
	}
	
	public String upperCase(String str1) {
		str1 = str1.toUpperCase();
		return str1;
	} 
	 
	
	 
	
}
