package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.main.NetworkResarch;

class NetworkResarchTest {

	NetworkResarch nr = new NetworkResarch();
	
	@Test
	void testFindeNetwork() {
		assertEquals(5, nr.findeNetwork(1));
	}

}
