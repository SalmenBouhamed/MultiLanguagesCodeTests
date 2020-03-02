package com.practice.main;

public class RemoveWhiteSpaces {

	public String RemoveWhiteSpacesFromString(String str){
		
		char[] strChar = str.toCharArray();
		StringBuilder myStr = new StringBuilder();
	
		for (char c : strChar) {
			if (c != ' ') {
				myStr.append(c);
			}
		}
		return myStr.toString();
	}
	
}
