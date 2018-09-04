package com.stackroute.utilities;

public class ReverseString {
	String str1 = "hello";
	
	public static String revStr(String str1) {
		String str2 = "";
		for(int i = str1.length()-1; i>=0;i--) {
			str2 = str2 + str1.charAt(i);
		}
		return str2; //olleh
	}
	
}
