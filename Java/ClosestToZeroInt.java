package com.practice.main;

import java.util.Arrays;

public class ClosestToZero {

	
	 public int  closestToZero(int[] data) {

//	        int[] data = {2,3,-2};
	        int curr = 0;
	        int near = data[0]; 
	        Arrays.sort(data);      //  add this
	        
	        // find the element nearest to zero
	        for ( int i=0; i < data.length; i++ ){
	            curr = data[i] * data[i]; 
	            if ( curr <= (near * near) )  { 
	                near = data[i];
	            } 
	        }
	        return near ; 
	    }
}
