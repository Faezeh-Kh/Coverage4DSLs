package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Factorial;

public class FactorialTest {
	Factorial factorial = new Factorial();
	
//	@Test
//	public void test1_Factorial0() {
//		int result = factorial.ComputeFac(0);
//		assertEquals(1, result);
//	}
	
	@Test
	public void test2_Factorial1() {
		int result = factorial.ComputeFac(1);
		assertEquals(1, result);
	}
//	
//	@Test
//	public void test3_FactorialMinus1() {
//		int result = factorial.ComputeFac(-1);
//		assertEquals(1, result);
//	}
//	
//	@Test
//	public void test4_Factorial10() {
//		int result = factorial.ComputeFac(10);
//		assertEquals(3628800, result);
//	}

}
