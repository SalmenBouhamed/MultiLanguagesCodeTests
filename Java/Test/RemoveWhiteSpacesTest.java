package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.practice.main.RemoveWhiteSpaces;

public class RemoveWhiteSpacesTest {
	
	String str = "hello world";
	RemoveWhiteSpaces rws = new RemoveWhiteSpaces();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void RemoveWhiteSpacesFromString() {
		assertEquals("helloworld", rws.RemoveWhiteSpacesFromString(str)); 
	}

}
