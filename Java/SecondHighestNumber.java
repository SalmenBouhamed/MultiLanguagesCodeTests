package com.practice.main;

public class SecondHighestNumber {
	
	public int secondHighestNumberInArray(int[] array){
		
		int max=0;
		int secondMax=0;
		for (int i : array) {
			if(max<i) {
				secondMax= max;
				max=i;
			}else  if(secondMax < i  ) {
				secondMax=i;
			}
		
		}
		return secondMax;
	}

}
