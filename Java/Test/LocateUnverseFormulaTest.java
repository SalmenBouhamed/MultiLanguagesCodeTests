package com.practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.practice.main.LocateUnverseFormula;

class LocateUnverseFormulaTest {
	LocateUnverseFormula luf = new LocateUnverseFormula();
	 File dir = new File("/tmp/documents");
	
	@Test
	void testLocate_universe_formula() {
		assertEquals("/tmp/documents/documents2/universe_formula", luf.locate_universe_formula(dir,"universe_formula"));
		assertEquals("file not found", luf.locate_universe_formula(dir,"universe_formula1"));
	}

}
