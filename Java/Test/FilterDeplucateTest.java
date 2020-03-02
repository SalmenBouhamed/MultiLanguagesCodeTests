package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.practice.main.FilterDeplucate;

class FilterDeplucateTest {
	FilterDeplucate fd = new FilterDeplucate()	;
	//Array with duplicate elements
    Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
	@Test
	void test() {
		assertEquals(5, fd.removeDuplicateElements(numbers).length);
	}

}
