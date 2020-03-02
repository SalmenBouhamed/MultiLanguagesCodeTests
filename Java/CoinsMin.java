package com.practice.main;

public class CoinsMin {
	
	
	public String findCoinsReturn(int n) {
		return n/10+"/"+(n%10)/5+"/"+((n%10)%5)/2;
	}

}
