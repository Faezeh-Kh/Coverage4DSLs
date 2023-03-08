package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.LinearSearch;

public class LinearSearchTest {

	LinearSearch linearSearch = new LinearSearch();
//	@Test
//	public void test1_Exists() {
//		linearSearch.Init(20);
//		assertEquals(true, linearSearch.Search(20));
//		assertEquals(true, linearSearch.Search(38));
//	}
//
//	@Test
//	public void test2_Exists() {
//		linearSearch.Init(1);
//		assertEquals(true, linearSearch.Search(0));
//	}
//	
//	@Test
//	public void test3_NotExists() {
//		linearSearch.Init(20);
//		assertEquals(false, linearSearch.Search(19));
//		assertEquals(false, linearSearch.Search(40));
//	}
//	
	@Test
	public void test4_NotExists() {
		linearSearch.Init(1);
		assertEquals(false, linearSearch.Search(1));
	}

}
