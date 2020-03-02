package com.practice.main;

public class Armstrong {
	
	public boolean isArmstrong(int num){
		int myNum = num;
		int armstrongNm = 0;
		while(myNum>0) {      
			int tmp  =  myNum % 10 ;
			armstrongNm = armstrongNm + tmp*tmp*tmp;
			myNum = myNum /10;
		}
		return armstrongNm == num  ;
	}
	
	
	
	
	
	     
	
}


