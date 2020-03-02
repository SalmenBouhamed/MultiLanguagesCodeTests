package com.practice.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.main.ClosestToZero;

class ClosestToZeroTest {
	ClosestToZero cz = new ClosestToZero(); 
	 int[] data = {2,3,-2};
	@Test
	void testClosestToZero() {
		assertEquals(2,cz.closestToZero(data));
	}

}
