package com.practice.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.main.NombreDePair;

class NombreDePairTest {
	
	NombreDePair np = new NombreDePair();
	
	@Test
	void testNombreDePair() {
		assertEquals(6,np.nombreDePair(4));
	}

}
