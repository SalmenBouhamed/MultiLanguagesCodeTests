package com.practice.main;

public class Reshape {
       public String reshape(String str, int n) {
    	   
    	   str = str.replace(" ", "");
    	   
    	   char[] strChar = str.toCharArray();
    	   
    	   String result = "";
    	   int i =0;
    	   for (char c : strChar) {
    		
    		 if(i==3) {
    			 result = result + "/n" ;
    			 i=0;
    		 }  
    		 i++;
			result = result + c;
		   }
    	   
    	   
    	   return result;
       }
}
