package com.practice.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkResarch {
	 
	   public  Integer findeNetwork(Integer startPoint) {
		 
		 int[] fromIds = {1,2,3,4,6,7,9};
		 int[] toIds =   {3,6,4,6,9,3,5};

		 //create the map
		 Map<Integer,Integer> mapFromTo =  getMapFromTo(fromIds, toIds);
		
		 Integer fromPoint = startPoint;
		 Integer nextPoint = -1;
		 List<Integer> visited = new ArrayList<>();
		 
		 while ( true ) {
			if(visited.contains(fromPoint)) {		
				return fromPoint;	
			}else {
				visited.add(fromPoint);
				nextPoint = mapFromTo.get(fromPoint);	
				if(nextPoint == null || fromPoint == nextPoint) {  
					return fromPoint;
				}else {
					fromPoint = nextPoint;
				}
			}
		}
	 }
	   
	   public Map<Integer,Integer> getMapFromTo ( int[] fromIds, int[] toIds){
		     int i = 0;
			 Map<Integer,Integer> mapFromTo= new HashMap<>();
			 for (Integer from : fromIds) {
				 mapFromTo.put(from,toIds[i]);
				 i++;
			}
			 return mapFromTo;
	   }
}
