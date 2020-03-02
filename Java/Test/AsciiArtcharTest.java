package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.practice.main.AsciiArtchar;

public class AsciiArtcharTest {
	
	AsciiArtchar asciiArtchar = new AsciiArtchar();

	@Test
	public void testGetLetterFormAsciiCode() {
		assertEquals("A",asciiArtchar.getLetterFormAsciiCode(1));
	}

}
