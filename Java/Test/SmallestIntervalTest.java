package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.practice.main.SmallestInterval;

class SmallestIntervalTest {
	SmallestInterval mi = new  SmallestInterval();
	int[] tab = {1,6,4,8,2};
	@Test
	void test() {
		assertEquals( 1, mi.smallestIntervall(tab));
	}

}
