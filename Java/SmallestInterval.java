package com.practice.main;

import java.util.ArrayList;
import java.util.List;

public class SmallestInterval {

	public int smallestIntervall(int[] tab) {
		
		List<Integer> inteval = new ArrayList<Integer>();
		
		//create interval tab
		for(int i = 0 ;i<tab.length;i++) {
			for(int j = 0 ;j<tab.length;j++) {
				if(i!=j) {
					inteval.add(Math.abs(tab[i]-tab[j]));
				}
			}
		}
		
		//found min
		int min = inteval.get(0) ;
		for (Integer integer : inteval) {
			if(integer<min) {
				min=integer;
			}
			
		}
		
		return min ; 
	}
	
}
