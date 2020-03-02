package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.practice.main.SecondHighestNumber;

class SecondHighestNumberTest {
	
	SecondHighestNumber secondHighestNumber = new SecondHighestNumber();

	@Test
	void testSecondHighestNumberInArray() {
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		assertEquals(secondHighestNumber.secondHighestNumberInArray(arr),94);
	}

}
