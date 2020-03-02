package com.practice.main;

import java.util.HashMap;
import java.util.Map;

public class AsciiArtchar {
	
	
	   public String getLetterFormAsciiCode(int code){
		    
		   String letter[] = {"A","B","C"};
		   
		   //j ai utilisé des code la place de  asci representation
		   Integer numbers[] = {1,2,3};
		   Map<Integer,String> mapChar = new HashMap<>();
		   int i = 0;
		   for (String c : letter) {
			   mapChar.put(numbers[i], c);
	           i++;	
		   }
		   
		   return mapChar.getOrDefault(code, null);
	   }

}
