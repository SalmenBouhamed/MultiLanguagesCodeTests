package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.practice.main.CoinsMin;
import com.practice.main.MultipleSomme;

class CoinsMinTest {
	CoinsMin cm = new CoinsMin();
	@Test
	void testFindCoinsReturn() {
		assertEquals("2/1/1", cm.findCoinsReturn(27));
	}
	
	MultipleSomme ms = new MultipleSomme();
	
	@Test
	void testMultipleSomme() {
		assertEquals(40, ms.multipleSomme(11));
	}

}
