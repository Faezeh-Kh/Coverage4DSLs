package org.cambridge.java.classes.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.cambridge.java.classes.LinearSearch;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

	LinearSearch linearSearch = new LinearSearch();
	@Test
	void test1_Exists() {
		linearSearch.Init(20);
		assertEquals(true, linearSearch.Search(20));
		assertEquals(true, linearSearch.Search(38));
	}

	@Test
	void test2_Exists() {
		linearSearch.Init(1);
		assertEquals(true, linearSearch.Search(0));
	}
	
	@Test
	void test3_NotExists() {
		linearSearch.Init(20);
		assertEquals(false, linearSearch.Search(19));
		assertEquals(false, linearSearch.Search(40));
	}
	
	@Test
	void test4_NotExists() {
		linearSearch.Init(1);
		assertEquals(false, linearSearch.Search(1));
	}

}
