package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.main.Reshape;

class ReshapeTest {
	
	Reshape re = new Reshape();
	
	@Test
	void testReshape() {
		assertEquals("abc/ndef/nghi/nj", re.reshape("abc de fghij", 3)); 
	}

}
