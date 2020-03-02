package com.practice.main;

public class MultipleSomme {

	
	public int multipleSomme(int n) {
		
		int i=0;
		int somme =0;
		 
		while(i<=n) {
			if(i%3 == 0||i%5 == 0||i%7 == 0) {
			  somme = somme +i;
			}
			i++;
		}
		System.out.println(somme);
		return somme;
		
	}
}
