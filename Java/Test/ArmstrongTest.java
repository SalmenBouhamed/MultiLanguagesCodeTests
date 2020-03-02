package com.practice.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.practice.main.Armstrong;

class ArmstrongTest {
	Armstrong arm = new Armstrong();
	@Test
	public final void thisIsArmstrong() {
		
		assertTrue("this is armstrong num",arm.isArmstrong(370));
	}
	
	@Test
	public final void thisIsNotArmstrong() {
		
		assertFalse("this is armstrong num",arm.isArmstrong(375));
	}



}
