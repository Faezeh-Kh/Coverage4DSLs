package org.cambridge.java.classes.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.cambridge.java.classes.Factorial;

import org.junit.jupiter.api.Test;

class FactorialTest {
	Factorial factorial = new Factorial();
	
//	@Test
//	void test1_Factorial0() {
//		int result = factorial.ComputeFac(0);
//		assertEquals(1, result);
//	}
	
	@Test
	void test2_Factorial1() {
		int result = factorial.ComputeFac(1);
		assertEquals(1, result);
	}
//	
//	@Test
//	void test3_FactorialMinus1() {
//		int result = factorial.ComputeFac(-1);
//		assertEquals(1, result);
//	}
//	
//	@Test
//	void test4_Factorial10() {
//		int result = factorial.ComputeFac(10);
//		assertEquals(3628800, result);
//	}

}
