package org.cambridge.java.classes.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.cambridge.java.classes.BinarySearch;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
	
	BinarySearch binarySearch = new BinarySearch();
	@Test
	void test1_Exists() {
		binarySearch.Init(20);
		assertEquals(true, binarySearch.Search(20));
		assertEquals(true, binarySearch.Search(38));
	}

	@Test
	void test2_Exists() {
		binarySearch.Init(1);
		assertEquals(true, binarySearch.Search(0));
	}
	
	@Test
	void test3_NotExists() {
		binarySearch.Init(20);
		assertEquals(false, binarySearch.Search(19));
		assertEquals(false, binarySearch.Search(40));
	}
	
	@Test
	void test4_NotExists() {
		binarySearch.Init(1);
		assertEquals(false, binarySearch.Search(1));
	}
	
	@Test
	void test5_Compare() {
		assertEquals(true, binarySearch.Compare(0, 0));
	}
	
	@Test
	void test6_Compare() {
		assertEquals(false, binarySearch.Compare(1, 0));
	}
	
	@Test
	void test7_Compare() {
		assertEquals(false, binarySearch.Compare(0, 1));
	}
	
	@Test
	void test8_Compare() {
		assertEquals(true, binarySearch.Compare(1, 1));
	}
	
	@Test
	void test9_Compare() {
		assertEquals(false, binarySearch.Compare(0, -1));
	}
	
	@Test
	void test10_Compare() {
		assertEquals(true, binarySearch.Compare(-1, -1));
	}
	
	@Test
	void test11_Div() {
		assertEquals(0, binarySearch.Div(0));
	}
	@Test
	void test12_Div() {
		assertEquals(0.0, binarySearch.Div(1));
	}
	@Test
	void test13_Div() {
		assertEquals(1, binarySearch.Div(2));
	}
	@Test
	void test14_Div() {
		assertEquals(0.0, binarySearch.Div(-1));
	}
}
